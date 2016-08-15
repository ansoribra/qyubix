package com.qyubix.entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotNull
    @Size(min = 1)
    private String user_name;

    @Email
    @NotNull
    @Size(min = 1)
    private String user_email;

    @NotNull
    @Size(min = 1)
    private String user_password;

    @NotNull
    @Size(min = 1)
    @Past
    private String user_birth;

    private String user_active_from;
    private String user_status;
    private String user_last_login;
    private String user_activity;
    private String user_star;

}
