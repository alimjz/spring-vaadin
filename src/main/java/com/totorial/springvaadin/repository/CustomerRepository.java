package com.totorial.springvaadin.repository;

import com.totorial.springvaadin.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);

}
