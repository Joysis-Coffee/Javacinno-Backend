package net.mdjava.springbootbackend.repository;
import net.mdjava.springbootbackend.model.Transaction;
import org.springframework.data.domain.Sort;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findAllByOrderByTransactionDateDesc();

    @Query("SELECT t FROM Transaction t JOIN FETCH t.sales")
    List<Transaction> findAllWithSales();
}
