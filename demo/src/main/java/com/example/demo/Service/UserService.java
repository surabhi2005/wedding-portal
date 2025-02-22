package com.example.demo.Service;
import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private UserRepository urepo;
    public User addUser(User u)
    {
        return urepo.save(u);
    }
    public List<User> getuser()
    {
        return urepo.findAll();
    }
    public User updateUser(int id,User u)
    {
        u.setuserid(id);
        return urepo.save(u);
    }
    public String deleteuser(int userid)
    {
        urepo.deleteById(userid);
        return "Successfully deleted";
    }
    public User getbyid(int id)
    {
        return urepo.findById(id);
    }
    
}
