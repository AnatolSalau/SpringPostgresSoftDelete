package com.example.springpostgressoftdelete.db.repository;

import com.example.springpostgressoftdelete.db.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

      @Override
      <S extends Product> S save(S product);

      @Override
      void deleteById(Long id);
}
