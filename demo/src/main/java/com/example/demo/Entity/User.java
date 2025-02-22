package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private String name;
    @JsonIgnore
    private String password;
    private String email;
    private String role;
    private String address;
     public User()
     {

     }
     public User(int uid,String name,String password,String email,String role,String address)
     {
         this.uid=uid;
         this.name=name;
         this.password=password;
         this.email=email;
         this.role=role;
         this.address=address; 
     }
     public int getuid()
     {
         return uid;
     }
     public String getname()
     {
         return name;
     }
     public String getpassword()
     {
         return password;
     }
     public String getemail()
     {
         return email;
     }
     public String getrole()
    {
         return role;
     }
     public String getaddress()
     {
         return address;
    }
    public void setuserid(int uid)
    {
        this.uid=uid;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setpassword(String password)
    {
        this.password=password;
    }
    public void setrole(String role)
    {
        this.role=role;
    }
    public void setemail(String email)
    {
        this.email=email;
    }
     public void setaddress(String address)
     {
         this.address=address;
     }
    
}
