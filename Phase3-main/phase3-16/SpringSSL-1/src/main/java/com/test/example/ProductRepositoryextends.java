package com.test.example;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepositoryextends extends JpaRepository<ProductEntity, Integer> {

}
