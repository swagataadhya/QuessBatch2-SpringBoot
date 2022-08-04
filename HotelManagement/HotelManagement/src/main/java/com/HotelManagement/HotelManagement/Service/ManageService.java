package com.HotelManagement.HotelManagement.Service;

import com.HotelManagement.HotelManagement.Model.Customer;
import com.HotelManagement.HotelManagement.Repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageService implements IntfService{
    @Autowired
    ManagerRepo repo;
    @Override
    public void addCust(Customer c) {
        repo.save(c);
    }

    @Override
    public List<Customer> getCst() {
        return repo.findAll();
    }

    @Override
    public void deleteCst(int id) {
        repo.findById(id).orElseThrow();
        repo.deleteById(id);
    }

    @Override
    public void updateCust(int id,Customer c) {
        Customer cst=repo.findById(id).orElseThrow();
        cst.setCfname(c.getCfname());
        cst.setClname(c.getClname());
        cst.setCphno(c.getCphno());
        cst.setAddress(c.getAddress());
        cst.setDays(c.getDays());
        repo.save(cst);
    }
}
