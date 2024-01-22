package net.mdjava.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "small_price")
    private BigDecimal small_price;

    @Column(name = "medium_price")
    private BigDecimal medium_price;

    @Column(name = "large_price")
    private BigDecimal large_price;

    @Column(name = "revenue")
    private BigDecimal revenue = BigDecimal.ZERO;


    @Column(name = "total_items_sold")
    private BigDecimal total_items_sold = BigDecimal.ZERO;

}
