package com.example.springpostgressoftdelete.db.repository;

import com.example.springpostgressoftdelete.db.entity.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientRepositoryTest {

      @Autowired
      private PatientRepository patientRepository;

      @Test
      void findAllByDeletedEquals() {
            List<Patient> allByDeletedEquals = patientRepository
                  .findAllByDeletedEquals(false);
            System.out.println(allByDeletedEquals.toString());
      }

      @Test
      void removePatientById() {
            patientRepository.removePatientById(-1L);
      }

      @Test
      void removePatientByLogin() {
            patientRepository.removePatientByLogin("patient2");
      }

      @Test
      void findAll() {
            List<Patient> all = patientRepository.findAll();
            System.out.println(all);
      }
}