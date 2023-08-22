package com.example.springpostgressoftdelete.db.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.SQLDelete;

@NoArgsConstructor
@ToString
@Getter

@Entity
@Table(name = "patients")
@SequenceGenerator(sequenceName = "patients_id_seq", name =
      "patients_id_seq", allocationSize = 1)
@SQLDelete(sql = "UPDATE patients SET deleted = true WHERE id=?")
@SQLDelete(sql = "UPDATE patients SET deleted = true WHERE login=?")
public class Patient {
      @Id
      @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
            "patients_id_seq")
      @Column(nullable = false)
      private Long id;

      @Column(nullable = false, unique = true)
      private String login;

      @Column(nullable = false)
      private String password;

      @ToString.Exclude
      private byte[] icon;

      @Column(nullable = false)
      private boolean deleted = Boolean.FALSE;

      public Patient(String login, String password) {
            this.login = login;
            this.password = password;
      }
}
