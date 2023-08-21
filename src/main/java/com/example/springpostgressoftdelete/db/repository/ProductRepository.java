package com.example.springpostgressoftdelete.db.repository;

import com.example.springpostgressoftdelete.db.entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends CrudRepository<Product, Long> {

      @Override
      <S extends Product> S save(S product);

      @Override
      void deleteById(Long id);

      void removeProductsByNameEquals(String name);

      List<Product> findAllByDeletedEquals(Boolean isDeleted);
}
