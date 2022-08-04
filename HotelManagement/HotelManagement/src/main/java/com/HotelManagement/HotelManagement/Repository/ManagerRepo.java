package com.HotelManagement.HotelManagement.Repository;

import com.HotelManagement.HotelManagement.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ManagerRepo extends JpaRepository<Customer,Integer> {

}
