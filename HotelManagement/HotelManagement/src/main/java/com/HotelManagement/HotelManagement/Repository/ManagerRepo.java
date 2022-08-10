package com.HotelManagement.HotelManagement.Repository;

import com.HotelManagement.HotelManagement.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepo extends JpaRepository<Customer,Integer> {
    Customer findByEmail(String data);
}
