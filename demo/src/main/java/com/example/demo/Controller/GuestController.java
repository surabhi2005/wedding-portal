// package com.example.demo.Controller;
// import com.example.demo.Entity.Guest;
// import com.example.demo.Service.GuestService;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// @RestController
// @RequestMapping("/guest")
// public class GuestController {
//    @Autowired
//    private GuestService gser;
//    @PostMapping("/post")
//    public Guest saveGuest(@RequestBody Guest g)
//    {
//     return gser.addguest(g);
//    }
//    @GetMapping("/guests")
//    public List<Guest> getallGuests()
//    {
//      return gser.getguest();
//    }
//    @PutMapping("/update/{id}")
//    public Guest modifyGuest(@PathVariable int id,@RequestBody Guest g)
//    {
//     return gser.updateguest(id,g);
//    }
//    @DeleteMapping("/delete/{id}")
//    public String deleteGuest(@PathVariable int id)
//    {
//     return gser.deleteguest(id);
//    }
   
    
// }
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
