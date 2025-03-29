// package com.example.demo.Entity;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.Id;
// import jakarta.persistence.GenerationType;
// @Entity
// public class Invitation {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int invid;
//     private String invitationDate;
//     private String responseDate;
//     private String RSVPStatus;
//     private String GuestName;
//     private String contactinfo;
//      public Invitation()
//      {

//      }
//      public Invitation(int invid,String RSVPStatus,String GuestName,String invitationDate,String responseDate,String contactinfo)
//      {
//          this.invid=invid;
//          this.invitationDate=invitationDate;
//          this.responseDate=responseDate;
//          this.RSVPStatus=RSVPStatus;
//          this.GuestName=GuestName;
//          this.contactinfo=contactinfo; 
//      }
//      public int getinvid()
//      {
//          return invid;
//      }
//      public String getRSVPStatus()
//      {
//          return RSVPStatus;
//      }
//      public String getGuestName()
//      {
//          return GuestName;
//      }
//      public String getinvitationDate()
//     {
//          return invitationDate;
//      }
//      public String getresponseDate()
//     {
//          return responseDate;
//      }
//      public String getcontactinfo()
//      {
//          return contactinfo;
//     }
//     public void setinvid(int invid)
//     {
//         this.invid=invid;
//     }
    
//     public void setRSVPStatus(String RSVPStatus)
//     {
//         this.RSVPStatus=RSVPStatus;
//     }
//     public void setGuestName(String GuestName)
//     {
//         this.GuestName=GuestName;
//     }
//     public void setinvitationDate(String invitationDate)
//     {
//         this.invitationDate=invitationDate;
//     }
//     public void setresponseDate(String responseDate)
//     {
//         this.responseDate=responseDate;
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

