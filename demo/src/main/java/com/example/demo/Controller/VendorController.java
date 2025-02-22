package com.example.demo.Controller;
import com.example.demo.Entity.Vendor;
import com.example.demo.Service.VendorService;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/vendor")
public class VendorController  {
   @Autowired
   private VendorService vser;
   @PostMapping("/add")
   public Vendor saveVendor(@RequestBody Vendor vsr)
   {
    return vser.addvendor(vsr);
   }
   @GetMapping("/vendors")
   public List<Vendor> getallVendors()
   {
     return vser.getvendor();
   }
   @PutMapping("/updat/{id}")
   public Vendor modifyVendor(@PathVariable int id,@RequestBody Vendor v)
   {
    return vser.updatevendor(id,v);
   }
   @DeleteMapping("/delet/{id}")
   public String deleteVendor(@PathVariable int id)
   {
    return vser.deletevendor(id);
   }
   @GetMapping("/search/{name}")
   public Vendor getvendorname(@PathVariable String name)
   {
     return vser.getbyname(name);
   }
   @GetMapping("/pa")
   public Page<Vendor> getpage(@RequestParam (defaultValue = "0")int page,@RequestParam (defaultValue = "1")int size,@RequestParam (defaultValue = "name") String sortBy,@RequestParam (defaultValue = "asc") String sortDirection)
   {
      return vser.getvendorbypage(page,size,sortBy,sortDirection);
   }
   @GetMapping("/findbyservice/{service}")
   public List<Vendor> getfindbyservices(@PathVariable String service)
   {
    return vser.getbyservices(service);
   }
      
}
