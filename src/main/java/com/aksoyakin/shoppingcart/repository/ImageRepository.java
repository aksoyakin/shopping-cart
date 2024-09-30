package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long> {

    List<Image> findByProductId(Long id);
}
