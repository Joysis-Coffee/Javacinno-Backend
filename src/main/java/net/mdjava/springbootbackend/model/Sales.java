package net.mdjava.springbootbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sales")

public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "transaction_id")
    private long transactionId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product; // Changed from cashier_id to cashier

    @Column(name = "size")
    private String size;

    @Column(name = "subtotal")
    private String subtotal;

    @Column(name = "quantity")
    private int quantity;



}
