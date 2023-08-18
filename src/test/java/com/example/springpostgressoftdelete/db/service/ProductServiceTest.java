package com.example.springpostgressoftdelete.db.service;

import com.example.springpostgressoftdelete.db.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductServiceTest {

      @Autowired
      private ProductService productService;

      private Product product = new Product("Product2", 23.23);


      @Test
      void create() {
            productService.create(product);
      }

      @Test
      void remove() {
            productService.remove(2L);
      }

      @Test
      void findAll() {
            List<Product> all = productService.findAll(false);
            System.err.println(all.toString());
      }
}