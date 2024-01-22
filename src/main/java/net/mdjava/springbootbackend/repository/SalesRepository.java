package net.mdjava.springbootbackend.repository;

import net.mdjava.springbootbackend.model.Sales;
import net.mdjava.springbootbackend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalesRepository extends JpaRepository<Sales, Long> {
    List<Sales> findByTransactionId(Long transactionId);

    @Query("SELECT s FROM Sales s JOIN FETCH s.product WHERE s.transactionId = :transactionId")
    List<Sales> findByTransactionIdWithProductDetails(@Param("transactionId") Long transactionId);

}