package com.example.springpostgressoftdelete.db.repository;

import com.example.springpostgressoftdelete.db.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductRepositoryTest {
      @Autowired
      ProductRepository productRepository;

      @Test
      void save() {
            Product product = new Product("product3", 333.123);
            productRepository.save(product);
      }

      @Test
      void deleteById() {
            productRepository.deleteById(4L);
      }


      @Test
      void findAllByDeletedEquals() {
            List<Product> allByDeletedEquals = productRepository.findAllByDeletedEquals(false);
            System.out.println("---------------allByDeletedEquals----------------");
            System.out.println(allByDeletedEquals);
            System.out.println("---------------allByDeletedEquals----------------");
      }

      @Test
      void deleteByName() {
            productRepository.removeProductsByNameEquals("Product5");
      }
}