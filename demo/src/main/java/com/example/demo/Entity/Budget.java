package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;
@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int budgetid;
    private int eventid;
    private int totalbudget;
    private int spentamount;
    private int remainingamount;
    public Budget()
    {

    }
    public Budget(int budgetid,int eventid,int totalbudget,int spentamount,int remainingamount)
    {
        this.budgetid=budgetid;
        this.eventid=eventid;
        this.totalbudget=totalbudget;
        this.spentamount=spentamount;
        this.remainingamount=remainingamount;
    }
    public int getbudgetid()
    {
        return budgetid;
    }
    public int geteventid()
    {
        return eventid;
    }
    public int gettotalbudget()
    {
        return totalbudget;
    }
    public int getspentamount()
    {
        return spentamount;
    }
    public int getremainingamount()
    {
        return remainingamount;
    } 
    public void setbudgetid(int budgetid)
    {
        this.budgetid=budgetid;
    }
    public void seteventid(int eventid)
    {
        this.eventid=eventid;
    }
    public void settotalbudget(int totalbudget)
    {
        this.totalbudget=totalbudget;
    }
    public void setspentamount(int spentamount)
    {
        this.spentamount=spentamount;
    }
    public void setremainingamount(int remainingamount)
    {
        this.remainingamount=remainingamount;
    }
     
}

