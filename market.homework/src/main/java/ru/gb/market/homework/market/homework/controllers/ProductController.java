package ru.gb.market.homework.market.homework.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import ru.gb.market.homework.market.homework.dto.ProductDto;
import ru.gb.market.homework.market.homework.model.Category;
import ru.gb.market.homework.market.homework.model.Product;
import ru.gb.market.homework.market.homework.services.CategoryService;
import ru.gb.market.homework.market.homework.services.ProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    private final CategoryService categoryService;



    @GetMapping("/products")
    public Page<ProductDto> findAll(@RequestParam(name = "p", defaultValue = "1") int pageIndex) {
        if (pageIndex < 1) {
            pageIndex = 1;
        }
        return productService.findAll(pageIndex - 1, 10).map(ProductDto::new);
    }




    @GetMapping("/products/{id}")
    public ProductDto findById(@PathVariable Long id){
        return new ProductDto(productService.findById(id).get());
    }


    @PostMapping("/products")
    public ProductDto save(@RequestBody ProductDto productDto){
        Product product = new Product();
        product.setId(productDto.getId());
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());
        Category category = categoryService.findByTitle(productDto.getCategoryTitle()).get();
        product.setCategory(category);
        productService.save(product);
        return new ProductDto(product);
    }



    @GetMapping("/products/price")
    public List<Product> findByPrice(@RequestParam(name = "min") int minPrice,
                                     @RequestParam (name = "max") int maxPrice){
        return productService.findByPriceBetween(minPrice, maxPrice);
    }



    @GetMapping("/products/delete/{id}")
    public void deleteProductById (@PathVariable Long id) {
        productService.deleteById(id);
    }

}



