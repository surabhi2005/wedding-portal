package com.example.demo.Controller;
import com.example.demo.Entity.Admin;
import com.example.demo.Service.AdminService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/admin")
public class AdminController {
   @Autowired
   private AdminService aser;
   @PostMapping("/post")
   public Admin saveAdmin(@RequestBody Admin a)
   {
    return aser.addadmin(a);
   }
   @GetMapping("/guests")
   public List<Admin> getallAdmins()
   {
     return aser.getadmin();
   }
   @PutMapping("/update/{id}")
   public Admin modifyAdmin(@PathVariable int id,@RequestBody Admin a)
   {
    return aser.updateadmin(id,a);
   }
   @DeleteMapping("/delete/{id}")
   public String deleteAdmin(@PathVariable int id)
   {
    return aser.deleteadmin(id);
   }
      
}
   


