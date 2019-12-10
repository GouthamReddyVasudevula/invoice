package com.invoice.invoice.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class Product {
    @Id
    private String id;
    private String description;
    private int quantity;
    private double rate;
    private double amount;


}
