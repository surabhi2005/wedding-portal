package com.example.demo.Controller;
import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import com.example.demo.Repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class UserController {

   @Autowired
   private UserService userser;

   @Autowired
   private UserRepository urepo;

   @PostMapping("/post")
   public User saveUser(@RequestBody User usr) {
       return userser.addUser(usr);
   }

   @GetMapping("/users")
   public List<User> getAllUsers() {
       return userser.getUsers();
   }

   @PutMapping("/update/{id}")
   public User modifyUser(@PathVariable int id, @RequestBody User u) {
       return userser.updateUser(id, u);
   }

   @DeleteMapping("/delete/{id}")
   public String deleteUser(@PathVariable int id) {
       return userser.deleteUser(id);
   }

   @GetMapping("/usernamewithc")
   public List<User> getUserStartWithC() {
       return urepo.findbyuserwithnamestartwithc();
   }
}