// package com.example.demo.Controller;
// import com.example.demo.Entity.Invitation;
// import com.example.demo.Service.InvitationService;
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
// @RequestMapping("/invi")
// public class InvitationController {
//    @Autowired
//    private InvitationService iser;
//    @PostMapping("/post")
//    public Invitation saveInvitation(@RequestBody Invitation i)
//    {
//     return iser.addinvi(i);
//    }
//    @GetMapping("/invites")
//    public List<Invitation> getallInvitation()
//    {
//      return iser.getinvitation();
//    }
//    @PutMapping("/updateinv/{id}")
//    public Invitation modifyInvitation(@PathVariable int id,@RequestBody Invitation i)
//    {
//     return iser.updateinvitation(id,i);
//    }
//    @DeleteMapping("/delete/{id}")
//    public String deleteInvitation(@PathVariable int id)
//    {
//     return iser.deleteinvi(id);
//    }
   
    
// }
package com.example.demo.Controller;
import com.example.demo.Entity.Invitation;
import com.example.demo.Service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("/invitations")
public class InvitationController {
    @Autowired
    private InvitationService iser;
    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Invitation addInvitation(
            @Valid @RequestBody Invitation invitation, 
            @RequestParam Set<Integer> guestIds) {
    
        return iser.addInvitation(invitation, guestIds);
    }
    
    @GetMapping(value = "/all", produces = "application/json")
    public List<Invitation> getAllInvitations() {
        return iser.getInvitations();
    }
    @PutMapping("/update/{id}")
    public Invitation modifyInvitation(@PathVariable int id, @RequestBody Invitation invitation, @RequestParam Set<Integer> guestIds) {
        return iser.updateInvitation(id, invitation, guestIds);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteInvitation(@PathVariable int id) {
        return iser.deleteInvitation(id);
    }
}
