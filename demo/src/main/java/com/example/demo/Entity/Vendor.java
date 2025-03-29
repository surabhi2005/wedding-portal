package com.example.demo.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vid;
    private String name;
    private String services;
    private String contactInfo;
    private String pricing;
    @ManyToOne
    @JoinColumn(name = "user_fk_id",referencedColumnName = "uid", nullable = false)
    @JsonBackReference
    private User user;
    public int getVid() { 
        return vid; 
    }
    public void setVid(int vid) { 
        this.vid = vid; 
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public String getServices() { 
        return services; 
    }
    public void setServices(String services) { 
        this.services = services; 
    }

    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { 
        this.contactInfo = contactInfo;
     }

    public String getPricing() { 
        return pricing; 
    }
    public void setPricing(String pricing) { 
        this.pricing = pricing; 
    }

    public User getUser() {
         return user; 
        }
    public void setUser(User user) { 
        this.user = user; 
    }
}
