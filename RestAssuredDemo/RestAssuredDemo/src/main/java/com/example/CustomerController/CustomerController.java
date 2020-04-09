package com.example.RestAssuredDemo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository repository;

    @GetMapping("/list")
    public List<Customer> findAll() {
        return repository.getData();
    }

    @GetMapping("/one/{id}")
    public Customer findOne(@PathVariable int id) {
        return repository.getData().get(id);

    }
}