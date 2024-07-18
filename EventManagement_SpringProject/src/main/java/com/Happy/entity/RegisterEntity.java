package com.Happy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data //generates getter setter noargs constructor
@Entity//used to create the table
@Table(name = "User_Register_Table")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private int userId;
    private String userEmail;
    private String userName;
    private String userPhone;
    private String userPassword;

}
