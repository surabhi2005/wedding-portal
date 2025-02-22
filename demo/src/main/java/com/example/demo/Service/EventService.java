package com.example.demo.Service;
import com.example.demo.Entity.Event;
import com.example.demo.Repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EventService {
    @Autowired
    EventRepository erepo;
    public Event addEvent(Event e)
    {
        return erepo.save(e);
    }
    public List<Event> getevent()
    {
        return erepo.findAll();
    }
    public Event updateEvent(int id,Event e)
    {
        e.setid(id);
        return erepo.save(e);
    }
    public String deleteEvent(int id)
    {
        erepo.deleteById(id);
        return "Successfully deleted";
    }
    public Event getbyname(String name)
    {
        return erepo.findByname(name);
    }
    
}

