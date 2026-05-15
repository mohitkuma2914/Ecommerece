package com.example.Ecommerce.repository;

import com.example.Ecommerce.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query(value = "select * from customer where gender = :gender AND age >= :age",nativeQuery = true)
    List<Customer> getAllByGenderAndAgeGreaterThan(String gender, int age);

    List<Customer> findByName(String name);
}
