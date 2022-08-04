package com.HotelManagement.HotelManagement.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "manager")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String cfname;
    @Column
    private String clname;
    @Column
    private String cphno;
    @Column
    private String cid;
    @Column
    private String address;
    @Column
    private String nationality;
    @Column
    private int days;
}
