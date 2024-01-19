package net.mdjava.springbootbackend.repository;

import net.mdjava.springbootbackend.model.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashierRepository extends JpaRepository<Cashier, Long> {

}
