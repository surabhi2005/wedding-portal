package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dateofevent;
    private String location;
    private String mealtype;
    public Event()
    {

    }
    public Event(int id,String name,String dateofevent,String location,String mealtype)
    {
        this.id=id;
        this.name=name;
        this.dateofevent=dateofevent;
        this.location=location;
        this.mealtype=mealtype;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public String getdateofevent()
    {
        return dateofevent;
    }
    public String getlocation()
    {
        return location;
    }
    public String getmealtype()
    {
        return mealtype;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setdateofevent(String dateofevent)
    {
        this.dateofevent=dateofevent;
    }
    public void setlocation(String location)
    {
        this.location=location;
    }
    public void setmealtype(String mealtype)
    {
        this.mealtype=mealtype;
    }
    
    
}

