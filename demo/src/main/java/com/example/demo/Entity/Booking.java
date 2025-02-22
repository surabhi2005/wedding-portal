package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int booking_id;
    private int eventid;
    private int vendorid;
    private int cost;
    private String service_type;
    private String status;
    public Booking()
    {

    }
    public Booking(int booking_id,int eventid,int vendorid,int cost,String service_type,String status)
    {
        this.booking_id=booking_id;
        this.eventid=eventid;
        this.vendorid=vendorid;
        this.cost=cost;
        this.service_type=service_type;
        this.status=status;
    }
    public int getbooking_id()
    {
        return booking_id;
    }
    public int geteventid()
    {
        return eventid;
    }
    public int getvendorid()
    {
        return vendorid;
    }
    public int getcost()
    {
        return cost;
    }
    public String getservice_type()
    {
        return service_type;
    }
    public String getstatus()
    {
        return status;
    }
    public void setbooking_id(int booking_id)
    {
        this.booking_id=booking_id;
    }
    public void seteventid(int eventid)
    {
        this.eventid=eventid;
    }
    public void setvendorid(int vendorid)
    {
        this.vendorid=vendorid;
    }
    public void setcost(int cost)
    {
        this.cost=cost;
    }
    public void setservice_type(String service_type)
    {
        this.service_type=service_type;
    }
    public void setstatus(String status)
    {
        this.status=status;
    }   
}

