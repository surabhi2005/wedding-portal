package com.example.demo.Entity;
import jakarta.persistence.*;
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dateofevent;
    private String location;
    private String mealtype;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "budget_id", referencedColumnName = "budgetid")
    private Budget budget;

    public Event() {}

    public Event(String name, String dateofevent, String location, String mealtype, Budget budget) {
        this.name = name;
        this.dateofevent = dateofevent;
        this.location = location;
        this.mealtype = mealtype;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofevent() {
        return dateofevent;
    }

    public void setDateofevent(String dateofevent) {
        this.dateofevent = dateofevent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMealtype() {
        return mealtype;
    }

    public void setMealtype(String mealtype) {
        this.mealtype = mealtype;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
