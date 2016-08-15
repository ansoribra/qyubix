package com.qyubix.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @Size(min = 1)
    private String product_mart_id;

    @NotNull
    @Size(min = 1)
    private String product_name;

    @NotNull
    @Size(min = 1)
    private String product_category;

    @NotNull
    @Size(min = 1)
    private int product_price;

    private String product_description;
    private String product_sold;
    private int product_rating;
    private int product_discount;
    private int product_discount_after;
}
