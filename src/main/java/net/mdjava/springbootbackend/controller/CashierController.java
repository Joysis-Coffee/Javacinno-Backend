package net.mdjava.springbootbackend.controller;

import net.mdjava.springbootbackend.exception.ResourceNotFoundException;
import net.mdjava.springbootbackend.model.Cashier;
import net.mdjava.springbootbackend.repository.CashierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1/cashier")
public class CashierController {

    @Autowired
    private CashierRepository cashierRepository;

    @GetMapping
    public List<Cashier> index() {
        return cashierRepository.findAll();
    }

    // build create product REST API
    @PostMapping
    public Cashier store(@RequestBody Cashier product) {
        return cashierRepository.save(product);
    }

    // build get product by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Cashier> show(@PathVariable long id) {
        Cashier product = cashierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cashier does not exist with id: " + id));
        return ResponseEntity.ok(product);
    }

    // build update product REST API
    @PutMapping("{id}")
    public ResponseEntity<Cashier> update(@PathVariable long id, @RequestBody Cashier cashierDetails) {
        Cashier updateCashier = cashierRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cashier does not exist with id: " + id));

        updateCashier.setFull_name(cashierDetails.getFull_name());
        updateCashier.setUser_name(cashierDetails.getUser_name());
        updateCashier.setPassword(cashierDetails.getPassword());

        cashierRepository.save(updateCashier);

        return ResponseEntity.ok(updateCashier);
    }



}
