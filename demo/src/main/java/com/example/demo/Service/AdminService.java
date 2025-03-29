package com.example.demo.Service;
import com.example.demo.Entity.Admin;
import com.example.demo.Repository.AdminRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService {
    @Autowired
    private AdminRepository arepo;
    public Admin addadmin(Admin a)
    {
        return arepo.save(a);
    }
    public List<Admin> getadmin()
    {
        return arepo.findAll();
    }
    public Admin updateadmin(int id,Admin a)
    {
        a.setadminid(id);
        return arepo.save(a);
    }
    public String deleteadmin(int adminid)
    {
        arepo.deleteById(adminid);
        return "Successfully deleted";
    }
    
}

