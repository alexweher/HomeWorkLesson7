package ru.gb.market.homework.market.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.market.homework.market.homework.model.Category;


import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByTitle(String title);
}
