package com.example.Ecommerce.repository;

import com.example.Ecommerce.models.Aadhar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadharRepository extends JpaRepository<Aadhar,Integer> {

}
