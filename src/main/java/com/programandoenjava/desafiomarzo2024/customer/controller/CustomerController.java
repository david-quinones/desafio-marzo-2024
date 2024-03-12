package com.programandoenjava.desafiomarzo2024.customer.controller;

import com.programandoenjava.desafiomarzo2024.customer.model.Customer;
import com.programandoenjava.desafiomarzo2024.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAll(){
        List<Customer> customers = customerService.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable final Integer id) {
        return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK );
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody final Customer customer) {
        try{
            return new ResponseEntity<>(customerService.guardar(customer), HttpStatus.CREATED);

        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //editar (objeto completo) @Put
    @PutMapping()
    public ResponseEntity<Customer> editar(@RequestBody final Customer customer){
        try{
            return new ResponseEntity<>(customerService.guardar(customer), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    //eliminar
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable final Integer id) {
        customerService.delete(id);
    }

}
