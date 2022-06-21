package ru.gb.market.homework.market.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.gb.market.homework.market.homework.model.Product;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("select p from Product p where p.price <= :maxPrice and p.price >= :minPrice")
    List<Product> findQ(int minPrice, int maxPrice);





}
