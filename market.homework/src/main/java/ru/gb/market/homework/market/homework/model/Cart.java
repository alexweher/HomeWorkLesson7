package ru.gb.market.homework.market.homework.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Data
@RequiredArgsConstructor
public class Cart {

    private List<Product> cartProducts;
}
