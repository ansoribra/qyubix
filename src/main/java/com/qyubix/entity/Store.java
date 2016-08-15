package com.qyubix.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Store {

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false,unique = true)
    @NotNull
    @Size(min = 3)
    private String store_id;

    @NotNull
    @Size(min = 1)
    private String store_password;

    @NotNull
    @Size(min = 1)
    private String store_name;

    private String store_product;

    @NotNull
    @Size(min = 1)
    private String store_location;

    private String store_description;

    @NotNull
    @Size(min = 1)
    private int store_phone_number;

    private String store_delivery;
    private String store_status;
    private int store_viewed;
    private Date store_created;
    private Date store_last_login;
    private int store_star;
    private int store_risk;
}
