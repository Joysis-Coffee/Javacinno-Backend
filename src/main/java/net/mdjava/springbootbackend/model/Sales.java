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
    private long transaction_id;

    @Column(name = "product_id")
    private long product_id;

    @Column(name = "size")
    private String size;

    @Column(name = "subtotal")
    private String subtotal;

    @Column(name = "quantity")
    private int quantity;


}
