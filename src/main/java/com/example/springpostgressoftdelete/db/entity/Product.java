package com.example.springpostgressoftdelete.db.entity;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.SQLDelete;

@NoArgsConstructor
@ToString

@Entity
@Table(name = "tbl_products")
@SequenceGenerator(sequenceName = "tbl_products_seq", name =
      "tbl_products_seq", allocationSize = 1)
@SQLDelete(sql = "UPDATE tbl_products SET deleted = true WHERE id=?")
@FilterDef(
      name = "deletedProductFilter",
      parameters = @ParamDef(name = "isDeleted", type = org.hibernate.type.descriptor.java.BooleanJavaType.class)
)
@Filter(name = "deletedProductFilter", condition = "deleted = :isDeleted")
public class Product {
      @Id
      @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
            "tbl_products_seq")
      private Long id;

      private String name;

      private double price;

      private boolean deleted = Boolean.FALSE;

      public Product(String name, double price) {
            this.name = name;
            this.price = price;
      }

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public double getPrice() {
            return price;
      }

      public void setPrice(double price) {
            this.price = price;
      }

      public boolean isDeleted() {
            return deleted;
      }

      public void setDeleted(boolean deleted) {
            this.deleted = deleted;
      }
}
