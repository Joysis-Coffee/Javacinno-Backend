package net.mdjava.springbootbackend.repository;

import net.mdjava.springbootbackend.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {

}