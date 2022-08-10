package com.HotelManagement.HotelManagement.Security;

import com.HotelManagement.HotelManagement.Model.Customer;
import com.HotelManagement.HotelManagement.Repository.ManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustmerDetails implements UserDetailsService {
    @Autowired
    private ManagerRepo hotelRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer hotels = this.hotelRepo.findByEmail(username);
        return hotels;
    }
}
