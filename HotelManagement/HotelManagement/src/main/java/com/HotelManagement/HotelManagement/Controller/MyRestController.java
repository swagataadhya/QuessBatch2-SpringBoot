package com.HotelManagement.HotelManagement.Controller;

import com.HotelManagement.HotelManagement.Model.Customer;
import com.HotelManagement.HotelManagement.Service.IntfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class MyRestController {
    @Autowired
    IntfService serv;
    @PostMapping
    Customer addCust(@RequestBody Customer cst)
    {
        serv.addCust(cst);
        return cst;
    }

    @GetMapping
    List<Customer> getAll()
    {
       return serv.getCst();
    }

    @DeleteMapping("{id}")
    public String deleteCust(@PathVariable(name ="id")int id)
    {
        serv.deleteCst(id);
        return "Done";
    }
    @PutMapping("{id}")
    public String updateCust(@PathVariable(name="id")int id,@RequestBody Customer cst)
    {
        serv.updateCust(id,cst);
        return "updated";
    }
}
