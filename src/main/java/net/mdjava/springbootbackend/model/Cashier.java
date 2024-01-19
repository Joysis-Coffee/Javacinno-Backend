package net.mdjava.springbootbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "cashier")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cashier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "password")
    private String password;




}
