package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
@Entity
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vid;
    private String name;
    private String services;
    private String contactInfo;
    private String pricing;
    public Vendor()
    {

    }
    public Vendor(int vid,String name,String services,String contactInfo,String pricing)
    {
        this.vid=vid;
        this.name=name;
        this.services=services;
        this.contactInfo=contactInfo;
        this.pricing=pricing;
    }
    public int getvid()
    {
        return vid;
    }
    public String getname()
    {
        return name;
    }
    public String getservices()
    {
        return services;
    }
    public String getcontactInfo()
    {
        return contactInfo;
    }
    public String getpricing()
    {
        return pricing;
    }
    public void setvid(int vid)
    {
        this.vid=vid;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setservices(String services)
    {
        this.services=services;
    }
    public void setcontactInfo(String contactInfo)
    {
        this.contactInfo=contactInfo;
    }
    public void setpricing(String pricing)
    {
        this.pricing=pricing;
    }
    
    
}
