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
