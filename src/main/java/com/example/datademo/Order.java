package com.example.datademo;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(precision = 3, scale = 2)
    private BigDecimal totalPrice;
    private LocalDate date;
    @ManyToOne
    private Customer customer;

    public Order() {
    }

    public Order(BigDecimal totalPrice, LocalDate date, Customer customer) {
        this.totalPrice = totalPrice;
        this.date = date;
        this.customer = customer;
    }
}
