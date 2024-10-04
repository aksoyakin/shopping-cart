package com.aksoyakin.shoppingcart.repository;

import com.aksoyakin.shoppingcart.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
