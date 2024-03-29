package net.mdjava.springbootbackend.repository;

import net.mdjava.springbootbackend.model.Product;
import net.mdjava.springbootbackend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByOrderByIdDesc();

}
