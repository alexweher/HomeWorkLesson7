package ru.gb.market.homework.market.homework.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.market.homework.market.homework.model.Product;
import ru.gb.market.homework.market.homework.services.CartService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;


    @GetMapping("/cart")
    public List<Product> showAll(){
        return cartService.showAll();


        @DeleteMapping("/cart/delete/{id}")
         public void delete(@PathVariable Long id){
            cartService.deleteProduct(id);
        }
    }


    @PostMapping("/cart/add/{id}")
    public void addInCart(@PathVariable Long id){
        cartService.addProduct(id);
    }

}
