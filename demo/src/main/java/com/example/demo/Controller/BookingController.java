package com.example.demo.Controller;
import com.example.demo.Entity.Booking;
import com.example.demo.Service.BookingService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/booking")
public class BookingController{
   @Autowired
   private BookingService bser;
   @PostMapping("/crete")
   public Booking saveBooking(@RequestBody Booking b)
   {
    return bser.addBooking(b);
   }
   @GetMapping("/bookings")
   public List<Booking> getallBooking()
   {
     return bser.getBooking();
   }
   @PutMapping("/updfate/{id}")
   public Booking modifyBooking(@PathVariable int id,@RequestBody Booking b)
   {
    return bser.updateBooking(id,b);
   }
   @DeleteMapping("/detlete/{id}")
   public String deleteBooking(@PathVariable int id)
   {
    return bser.deleteBooking(id);
   }   
   @GetMapping("/getevid/{eid}")
   public Booking geteveid(@PathVariable int eid)
   {
      return bser.getbyeventid(eid);
    }
    @GetMapping("/fvenid/{venid}")
   public Booking disvenid(@PathVariable int venid)
   {
      return bser.displayvenid(venid);
    }
    @GetMapping("/getbycost/{costs}")
    public List<Booking> displaybycost(@PathVariable int costs)
    {
        return bser.getbycostless(costs);
    }
}


