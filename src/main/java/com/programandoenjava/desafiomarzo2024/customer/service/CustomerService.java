package com.programandoenjava.desafiomarzo2024.customer.service;

import com.programandoenjava.desafiomarzo2024.customer.model.Customer;
import com.programandoenjava.desafiomarzo2024.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer findById(final Integer id){
        return customerRepository.findById(id).get();
    }

    public Customer guardar(final Customer customer){
        return customerRepository.save(customer);
    }

    public void delete (final Integer id){
        customerRepository.deleteById(id);
    }

}
