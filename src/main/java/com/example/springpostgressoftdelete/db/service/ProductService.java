package com.example.springpostgressoftdelete.db.service;

import com.example.springpostgressoftdelete.db.entity.Product;
import com.example.springpostgressoftdelete.db.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
      @Autowired
      private ProductRepository productRepository;

      public Product create(Product product) {
            return productRepository.save(product);
      }

      public void remove(Long id){
            productRepository.deleteById(id);
      }

}
