package com.HotelManagement.HotelManagement.Service;

import com.HotelManagement.HotelManagement.Model.Customer;

import java.util.List;

public interface IntfService {
    void addCust(Customer c);
    List<Customer> getCst();
    void deleteCst(int id);
    void updateCust(int id,Customer customer);
}
