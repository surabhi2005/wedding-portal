package com.example.demo.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminid;
    private String adminname;
    private String email;
    @JsonIgnore
    private String password;
     public Admin()
     {

     }
     public Admin(int adminid,String adminname,String email,String password)
     {
         this.adminid=adminid;
         this.adminname=adminname;
         this.email=email;
         this.password=password; 
     }
     public int getadminid()
     {
         return adminid;
     }
     public String getadminname()
     {
         return adminname;
     }
     public String getemail()
     {
         return email;
     }
     public String getpassword()
     {
         return password;
     }
    public void setadminid(int adminid)
    {
        this.adminid=adminid;
    }
    public void setadminname(String adminname)
    {
        this.adminname=adminname;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
    public void setpassword(String password)
    {
        this.password=password;
    }    
}

