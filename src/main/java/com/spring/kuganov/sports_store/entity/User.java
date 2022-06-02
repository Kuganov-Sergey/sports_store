package com.spring.kuganov.sports_store.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "phone")
    private long phone;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;

//    public User(String fullName, String city, String country, int phone, String email, String password, Role role, Status status) {
//        this.fullName = fullName;
//        this.city = city;
//        this.country = country;
//        this.phone = phone;
//        this.email = email;
//        this.password = password;
//        this.role = role;
//        this.status = status;
//    }
}
