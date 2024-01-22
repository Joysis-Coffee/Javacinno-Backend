package net.mdjava.springbootbackend.controller;

import net.mdjava.springbootbackend.exception.ResourceNotFoundException;
import net.mdjava.springbootbackend.model.Transaction;
import net.mdjava.springbootbackend.controller.TransactionController;
import net.mdjava.springbootbackend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1/transaction")
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;


    @GetMapping
    public List<Transaction> getTransactions() {
        // This will return the list of transactions ordered by date in descending order
        return transactionRepository.findAllByOrderByTransactionDateDesc();
    }

    /**
     * @return List<Transaction> of sales
     */
    public List<Transaction> getAllTransactionsWithSales() {
        return transactionRepository.findAllWithSales();
    }

    // build create transaction REST API
    @PostMapping
    public Transaction store(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    // build get transaction by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Transaction> show(@PathVariable long id) {
        Transaction transaction = transactionRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Transaction does not exist with id: " + id));
        return ResponseEntity.ok(transaction);
    }


}
