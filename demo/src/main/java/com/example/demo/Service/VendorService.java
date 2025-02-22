package com.example.demo.Service;
import com.example.demo.Entity.Vendor;
import com.example.demo.Repository.VendorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class VendorService {
    @Autowired
    private VendorRepository vrepo;
    public Vendor addvendor(Vendor v)
    {
        return vrepo.save(v);
    }
    public List<Vendor> getvendor()
    {
        return vrepo.findAll();
    }
    public Vendor updatevendor(int id,Vendor v)
    {
        v.setvid(id);
        return vrepo.save(v);
    }
    public String deletevendor(int id)
    {
        vrepo.deleteById(id);
        return "Successfully deleted";
    }
    public Vendor getbyname(String name)
    {
        return vrepo.findByname(name);
    }
    public Page<Vendor> getvendorbypage(int page,int size,String sortBy,String sortDirection)
    {
        Pageable pa=PageRequest.of(page,size,Sort.by("name").ascending());
        return vrepo.findAll(pa);
    }
    public List<Vendor> getbyservices(String service)
    {
        return vrepo.findbyservices(service);
    }
    
}
