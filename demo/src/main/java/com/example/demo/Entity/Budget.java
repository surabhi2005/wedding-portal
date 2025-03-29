// package com.example.demo.Entity;

// import jakarta.persistence.*;

// @Entity
// public class Budget {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int budgetid;
//     private int totalbudget;
//     private int spentamount;
//     private int remainingamount;

//     public Budget() {}

//     public Budget(int totalbudget, int spentamount, int remainingamount) {
//         this.totalbudget = totalbudget;
//         this.spentamount = spentamount;
//         this.remainingamount = remainingamount;
//     }

//     public int getBudgetid() {
//         return budgetid;
//     }

//     public void setBudgetid(int budgetid) {
//         this.budgetid = budgetid;
//     }

//     public int getTotalbudget() {
//         return totalbudget;
//     }

//     public void setTotalbudget(int totalbudget) {
//         this.totalbudget = totalbudget;
//     }

//     public int getSpentamount() {
//         return spentamount;
//     }

//     public void setSpentamount(int spentamount) {
//         this.spentamount = spentamount;
//     }

//     public int getRemainingamount() {
//         return remainingamount;
//     }

//     public void setRemainingamount(int remainingamount) {
//         this.remainingamount = remainingamount;
//     }
// }
package com.example.demo.Entity;

import jakarta.persistence.*;

@Entity
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int budgetid;
    private int totalbudget;
    private int spentamount;
    private int remainingamount;

    public Budget() {}

    public Budget(int totalbudget, int spentamount, int remainingamount) {
        this.totalbudget = totalbudget;
        this.spentamount = spentamount;
        this.remainingamount = remainingamount;
    }

    public int getBudgetid() {
        return budgetid;
    }

    public void setBudgetid(int budgetid) {
        this.budgetid = budgetid;
    }

    public int getTotalbudget() {
        return totalbudget;
    }

    public void setTotalbudget(int totalbudget) {
        this.totalbudget = totalbudget;
    }

    public int getSpentamount() {
        return spentamount;
    }

    public void setSpentamount(int spentamount) {
        this.spentamount = spentamount;
    }

    public int getRemainingamount() {
        return remainingamount;
    }

    public void setRemainingamount(int remainingamount) {
        this.remainingamount = remainingamount;
    }
}
