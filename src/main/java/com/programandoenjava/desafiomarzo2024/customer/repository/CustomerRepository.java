package com.programandoenjava.desafiomarzo2024.customer.repository;

import com.programandoenjava.desafiomarzo2024.customer.model.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
