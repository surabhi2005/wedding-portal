package com.example.demo.Service;
import com.example.demo.Entity.Booking;
import com.example.demo.Repository.BookingRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookingService {
    @Autowired
    BookingRepository brepo;
    public Booking addBooking(Booking b)
    {
        return brepo.save(b);
    }
    public List<Booking> getBooking()
    {
        return brepo.findAll();
    }
    public Booking updateBooking(int id,Booking b)
    {
        b.setbooking_id(id);
        return brepo.save(b);
    }
    public String deleteBooking(int id)
    {
        brepo.deleteById(id);
        return "Successfully deleted";
    } 
    public Booking getbyeventid(int eid)
    {
        return brepo.findByeventid(eid);
    }
    public Booking displayvenid(int venid)
    {
        return brepo.findByvendorid(venid);
    }
    public List<Booking> getbycostless(int costs)
    {
        return brepo.findbycostlesser(costs);
    }
}


