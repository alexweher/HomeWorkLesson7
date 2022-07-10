package ru.gb.market.homework.market.homework.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.gb.market.homework.market.homework.model.Cart;
import ru.gb.market.homework.market.homework.model.Product;
import ru.gb.market.homework.market.homework.repositories.ProductRepository;

import java.util.List;

@Component
@Service
@RequiredArgsConstructor
public class CartService {

    private final ProductRepository productRepository;


    private Cart cart;

    public List<Product> showAll(){
        return cart.getCartProducts();
    }


    public void deleteProduct(Long id){
        List<Product> cartProduct = cart.getCartProducts();
        cartProduct.remove(productRepository.findById(id).get());
    }


    public void addProduct(Long id){
        List<Product> cartProduct = cart.getCartProducts();
        cartProduct.add(productRepository.findById(id).get());

    }
}



