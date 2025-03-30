package com.example.demo.Service;

import com.example.demo.Entity.Invitation;
import com.example.demo.Entity.Guest;
import com.example.demo.Repository.InvitationRepository;
import com.example.demo.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class InvitationService {
    @Autowired
    private InvitationRepository irepo;
    @Autowired
    private GuestRepository grepo;
    public Invitation addInvitation(Invitation invitation, Set<Integer> guestIds) {
        Set<Guest> guests = new HashSet<>(grepo.findAllById(guestIds));
        invitation.setGuests(guests);
        return irepo.save(invitation);
    }
    public List<Invitation> getInvitations() {
        return irepo.findAll();
    }
    public Optional<Invitation> getInvitationById(int id) {
        return irepo.findById(id);
    }
    public Invitation updateInvitation(int id, Invitation invitation, Set<Integer> guestIds) {
        if (irepo.existsById(id)) {
            Set<Guest> guests = new HashSet<>(grepo.findAllById(guestIds));
            invitation.setInvid(id);
            invitation.setGuests(guests);
            return irepo.save(invitation);
        } else {
            throw new RuntimeException("Invitation with ID " + id + " not found!");
        }
    }
    public String deleteInvitation(int invid) {
        if (irepo.existsById(invid)) {
            irepo.deleteById(invid);
            return "Invitation successfully deleted!";
        } else {
            return "Invitation with ID " + invid + " not found!";
        }
    }
}
