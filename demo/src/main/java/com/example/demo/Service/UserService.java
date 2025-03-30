package com.example.demo.Service;
import com.example.demo.Entity.User;
import com.example.demo.Entity.Vendor;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository urepo;

    @Autowired
    private VendorRepository vrepo;

    public User addUser(User u) {
        if (u.getVendors() != null) {
            for (Vendor v : u.getVendors()) {
                v.setUser(u);
            }
        }
        return urepo.save(u);
    }

    public List<User> getUsers() {
        return urepo.findAll();
    }
    public User updateUser(int id, User updatedUser) {
        Optional<User> existingUserOpt = urepo.findById(id);
        if (existingUserOpt.isPresent()) {
            User existingUser = existingUserOpt.get();
            if (updatedUser.getName() != null) existingUser.setName(updatedUser.getName());
            if (updatedUser.getPassword() != null) existingUser.setPassword(updatedUser.getPassword());
            if (updatedUser.getEmail() != null) existingUser.setEmail(updatedUser.getEmail());
            if (updatedUser.getRole() != null) existingUser.setRole(updatedUser.getRole());
            if (updatedUser.getAddress() != null) existingUser.setAddress(updatedUser.getAddress());
            if (updatedUser.getVendors() != null) {
                for (Vendor newVendor : updatedUser.getVendors()) {
                    newVendor.setUser(existingUser); 
                }
                existingUser.getVendors().clear();  
                existingUser.getVendors().addAll(updatedUser.getVendors()); 
            }
    
            return urepo.save(existingUser); 
        }
        return null;
    }
    public String deleteUser(int userid) {
        if (urepo.existsById(userid)) {
            urepo.deleteById(userid);
            return "Successfully deleted";
        }
        return "User not found";
    }
}
