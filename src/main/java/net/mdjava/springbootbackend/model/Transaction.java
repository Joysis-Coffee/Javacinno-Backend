package net.mdjava.springbootbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "cashier_id")
    private long cashier_id;

    @Column(name = "transaction_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "cash")
    private int cash;

    @Column(name = "change_amount")
    private int change_amount;

    @Column(name = "time_served")
    private String time_served;

    @Column(name = "status")
    private boolean status;

    @Column(name = "total")
    private int total;

    @PrePersist
    protected void onCreate() {
        transactionDate = new Date();
    }

}
