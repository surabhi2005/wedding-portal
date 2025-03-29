// package com.example.demo.Entity;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.GenerationType;
// @Entity
// public class Guest {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int guestid;
//     private int eventid;
//     private String RSVPStatus;
//     private String GuestName;
//     private String Mealpreference;
//     private String contactinfo;
//      public Guest()
//      {

//      }
//      public Guest(int guestid,int eventid,String RSVPStatus,String GuestName,String Mealpreference,String contactinfo)
//      {
//          this.guestid=guestid;
//          this.eventid=eventid;
//          this.RSVPStatus=RSVPStatus;
//          this.GuestName=GuestName;
//          this.Mealpreference=Mealpreference;
//          this.contactinfo=contactinfo; 
//      }
//      public int getguestid()
//      {
//          return guestid;
//      }
//      public int geteventid()
//      {
//          return eventid;
//      }
//      public String getRSVPStatus()
//      {
//          return RSVPStatus;
//      }
//      public String getGuestName()
//      {
//          return GuestName;
//      }
//      public String getMealpreference()
//     {
//          return Mealpreference;
//      }
//      public String getcontactinfo()
//      {
//          return contactinfo;
//     }
//     public void setguestid(int guestid)
//     {
//         this.guestid=guestid;
//     }
//     public void seteventid(int eventid)
//     {
//         this.eventid=eventid;
//     }
//     public void setRSVPStatus(String RSVPStatus)
//     {
//         this.RSVPStatus=RSVPStatus;
//     }
//     public void setGuestName(String GuestName)
//     {
//         this.GuestName=GuestName;
//     }
//     public void setMealpreference(String Mealpreference)
//     {
//         this.Mealpreference=Mealpreference;
//     }
//      public void setcontactinfo(String contactinfo)
//      {
//          this.contactinfo=contactinfo;
//      }
    
// }
package com.example.demo.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guestid;

    private String GuestName;
    private String Mealpreference;
    private String contactinfo;
    private int eventid;
    private String RSVPStatus;

    @ManyToMany(mappedBy = "guests")
     @JsonIgnoreProperties("guests")
    private Set<Invitation> invitations = new HashSet<>();

    public Guest() {}

    public Guest(String GuestName, String Mealpreference, String contactinfo, int eventid, String RSVPStatus) {
        this.GuestName = GuestName;
        this.Mealpreference = Mealpreference;
        this.contactinfo = contactinfo;
        this.eventid = eventid;
        this.RSVPStatus = RSVPStatus;
    }

    public int getGuestid() {
        return guestid;
    }

    public void setGuestid(int guestid) {
        this.guestid = guestid;
    }

    public String getGuestName() {
        return GuestName;
    }

    public void setGuestName(String GuestName) {
        this.GuestName = GuestName;
    }

    public String getMealpreference() {
        return Mealpreference;
    }

    public void setMealpreference(String Mealpreference) {
        this.Mealpreference = Mealpreference;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getRSVPStatus() {
        return RSVPStatus;
    }

    public void setRSVPStatus(String RSVPStatus) {
        this.RSVPStatus = RSVPStatus;
    }

    public Set<Invitation> getInvitations() {
        return invitations;
    }

    public void setInvitations(Set<Invitation> invitations) {
        this.invitations = invitations;
    }
}
