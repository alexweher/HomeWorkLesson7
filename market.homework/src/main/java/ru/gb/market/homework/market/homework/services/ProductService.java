package ru.gb.market.homework.market.homework.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.market.homework.market.homework.model.Product;
import ru.gb.market.homework.market.homework.repositories.ProductRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;


    public List<Product> findAll(){
        return productRepository.findAll();
    }


    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }


    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }




    public List<Product> findByPriceBetween(int minPrice, int maxPrice){
        return productRepository.findQ(minPrice, maxPrice);
    }


    public List<Product> findAllByPriceAfterAndTitleContains(int minPrice, String s){
        return productRepository.findAllByPriceAfterAndTitleContains(minPrice, s);
    }

    public  List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice){
        return productRepository.findProductByPriceBetween(minPrice,maxPrice);
    }


    public List<Product> findProductByPriceLessThan(BigDecimal maxPrice){
        return productRepository.findProductByPriceLessThan(maxPrice);
    }


    public   List<Product> findProductByPriceGreaterThan(BigDecimal minPrice){
        return productRepository.findProductByPriceGreaterThan(minPrice);
    }



}
