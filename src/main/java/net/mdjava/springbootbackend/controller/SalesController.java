package net.mdjava.springbootbackend.controller;

import net.mdjava.springbootbackend.exception.ResourceNotFoundException;
import net.mdjava.springbootbackend.model.Sales;
import net.mdjava.springbootbackend.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1/sales")
public class SalesController {

    @Autowired
    private SalesRepository salesRepository;

    @GetMapping
    public List<Sales> index() {
        return salesRepository.findAll();
    }

    // build create transaction REST API
    @PostMapping
    public Sales store(@RequestBody Sales transaction) {
        return salesRepository.save(transaction);
    }

    // build get transaction by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Sales> show(@PathVariable long id) {
        Sales transaction = salesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Sales does not exist with id: " + id));
        return ResponseEntity.ok(transaction);
    }


}
