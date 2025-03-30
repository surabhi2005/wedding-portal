package com.example.demo.Controller;

import com.example.demo.Entity.Guest;
import com.example.demo.Service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/guests")
public class GuestController {
    @Autowired
    private GuestService gser;
@PostMapping("/add")
public Guest addGuest(@RequestBody Guest guest, 
                      @RequestParam(required = false) Set<Integer> invitationIds) {
    return gser.addGuest(guest, invitationIds != null ? invitationIds : new HashSet<>());
}
    @GetMapping("/all")
    public List<Guest> getAllGuests() {
        return gser.getGuests();
    }
    @GetMapping("/{id}")
    public Optional<Guest> getGuestById(@PathVariable int id) {
        return gser.getGuestById(id);
    }
    @PutMapping("/update/{id}")
    public Guest modifyGuest(@PathVariable int id, @RequestBody Guest guest, @RequestParam Set<Integer> invitationIds) {
        return gser.updateGuest(id, guest, invitationIds);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteGuest(@PathVariable int id) {
        return gser.deleteGuest(id);
    }
}
