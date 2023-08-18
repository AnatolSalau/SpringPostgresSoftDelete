package com.example.springpostgressoftdelete.db.repository;

import com.example.springpostgressoftdelete.db.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {
      @Autowired
      ProductRepository productRepository;

      @Test
      void save() {
            Product product = new Product("product1", 123.123);
            productRepository.save(product);
      }

      @Test
      void deleteById() {
            productRepository.deleteById(1L);
      }


}