// package com.example.demo.Service;
// import com.example.demo.Entity.Guest;
// import com.example.demo.Repository.GuestRepository;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// @Service
// public class GuestService {
//     @Autowired
//     private GuestRepository grepo;
//     public Guest addguest(Guest g)
//     {
//         return grepo.save(g);
//     }
//     public List<Guest> getguest()
//     {
//         return grepo.findAll();
//     }
//     public Guest updateguest(int id,Guest g)
//     {
//         g.setguestid(id);
//         return grepo.save(g);
//     }
//     public String deleteguest(int guestid)
//     {
//         grepo.deleteById(guestid);
//         return "Successfully deleted";
//     }
    
// }
package com.example.demo.Service;

import com.example.demo.Entity.Guest;
import com.example.demo.Entity.Invitation;
import com.example.demo.Repository.GuestRepository;
import com.example.demo.Repository.InvitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class GuestService {
    @Autowired
    private GuestRepository grepo;

    @Autowired
    private InvitationRepository irepo;
    public Guest addGuest(Guest guest, Set<Integer> invitationIds) {
        Set<Invitation> invitations = new HashSet<>(irepo.findAllById(invitationIds));
        guest.setInvitations(invitations);
        return grepo.save(guest);
    }
    public List<Guest> getGuests() {
        return grepo.findAll();
    }
    public Optional<Guest> getGuestById(int id) {
        return grepo.findById(id);
    }
    public Guest updateGuest(int id, Guest guest, Set<Integer> invitationIds) {
        if (grepo.existsById(id)) {
            Set<Invitation> invitations = new HashSet<>(irepo.findAllById(invitationIds));
            guest.setGuestid(id);
            guest.setInvitations(invitations);
            return grepo.save(guest);
        } else {
            throw new RuntimeException("Guest with ID " + id + " not found!");
        }
    }
    public String deleteGuest(int guestid) {
        if (grepo.existsById(guestid)) {
            grepo.deleteById(guestid);
            return "Guest successfully deleted!";
        } else {
            return "Guest with ID " + guestid + " not found!";
        }
    }
}
