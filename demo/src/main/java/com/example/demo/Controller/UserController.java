package com.example.demo.Controller;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import com.example.demo.Repository.UserRepository;
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
@RequestMapping("/api")
public class UserController {
   @Autowired
   private UserService userser;
   @Autowired
   private UserRepository urepo;
   @PostMapping("/post")
   public User saveUser(@RequestBody User usr)
   {
    return userser.addUser(usr);
   }
   @GetMapping("/users")
   public List<User> getallUsers()
   {
     return userser.getuser();
   }
   @PutMapping("/update/{id}")
   public User modifyUser(@PathVariable int id,@RequestBody User u)
   {
    return userser.updateUser(id,u);
   }
   @DeleteMapping("/delete/{id}")
   public String deleteUser(@PathVariable int id)
   {
    return userser.deleteuser(id);
   }
   @GetMapping("/usersid/{id}")
   public User getuserid(@PathVariable int id)
   {
     return userser.getbyid(id);
   }
   @GetMapping("/usernamewithc")
   public List<User> getuserstartwithc()
   {
    return urepo.findbyuserwithnamestartwithc();
   }

    
}
