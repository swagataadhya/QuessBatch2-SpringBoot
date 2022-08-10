package com.HotelManagement.HotelManagement.Model;

import lombok.Data;
import javax.persistence.*;


@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
}
