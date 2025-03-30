package com.example.demo.Entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Invitation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invid;

    private String invitationDate;
    private String responseDate;
    private String RSVPStatus;
    private String contactinfo;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "invitation_guest",
        joinColumns = @JoinColumn(name = "invitation_id"),
        inverseJoinColumns = @JoinColumn(name = "guest_id")
    )
      @JsonIgnoreProperties("invitations") 
    private Set<Guest> guests = new HashSet<>();

    public Invitation() {}

    public Invitation(String RSVPStatus, String invitationDate, String responseDate, String contactinfo) {
        this.RSVPStatus = RSVPStatus;
        this.invitationDate = invitationDate;
        this.responseDate = responseDate;
        this.contactinfo = contactinfo;
    }

    public int getInvid() {
        return invid;
    }

    public void setInvid(int invid) {
        this.invid = invid;
    }

    public String getInvitationDate() {
        return invitationDate;
    }

    public void setInvitationDate(String invitationDate) {
        this.invitationDate = invitationDate;
    }

    public String getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }

    public String getRSVPStatus() {
        return RSVPStatus;
    }

    public void setRSVPStatus(String RSVPStatus) {
        this.RSVPStatus = RSVPStatus;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public Set<Guest> getGuests() {
        return guests;
    }

    public void setGuests(Set<Guest> guests) {
        this.guests = guests;
    }
}

