package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
