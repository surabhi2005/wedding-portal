 package com.example.demo.Entity;
import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    private String password;
    private String email;
    private String role;
    private String address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Vendor> vendors;
    public int getUid() { 
        return uid; 
    }
    public void setUid(int uid) { 
        this.uid = uid; 
    }

    public String getName() {
         return name; 
        }
    public void setName(String name) { 
        this.name = name; 
    }

    public String getPassword() { 
        return password; 
    }
    public void setPassword(String password) { 
        this.password = password; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getRole() {
         return role; 
        }
    public void setRole(String role) { 
        this.role = role;
     }

    public String getAddress() { 
        return address;
     }
    public void setAddress(String address) {
         this.address = address;
         }

    public List<Vendor> getVendors() { 
        return vendors; 
    }
    public void setVendors(List<Vendor> vendors) {
        this.vendors = vendors;
        if (vendors != null) {
            for (Vendor v : vendors) {
                v.setUser(this);
            }
        }
    }
}