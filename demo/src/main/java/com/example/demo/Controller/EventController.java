// package com.example.demo.Controller;
// import com.example.demo.Entity.Event;
// import com.example.demo.Service.EventService;
// import com.example.demo.Repository.EventRepository;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// @RestController
// @RequestMapping("/event")
// public class EventController {
//    @Autowired
//    private EventService eser;
//    @Autowired
//    private EventRepository erepo;
//    @PostMapping("/crate")
//    public Event saveEvent(@RequestBody Event eve)
//    {
//     return eser.addEvent(eve);
//    }
//    @GetMapping("/events")
//    public List<Event> getallEvent()
//    {
//      return eser.getevent();
//    }
//    @PutMapping("/updte/{id}")
//    public Event modifyEvent(@PathVariable int id,@RequestBody Event e)
//    {
//     return eser.updateEvent(id,e);
//    }
//    @DeleteMapping("/deete/{id}")
//    public String deleteEvent(@PathVariable int id)
//    {
//     return eser.deleteEvent(id);
//    }
//    @GetMapping("/get/{name}")
//    public Event geteventname(@PathVariable String name)
//    {
//      return eser.getbyname(name);
//    }
//    @GetMapping("/eventdate")
//    public List<Event> getbydateofevent()
//    {
//     return erepo.findbyeventwithdateofevent();
//    }
     
// }
package com.example.demo.Controller;
import com.example.demo.Entity.Event;
import com.example.demo.Service.EventService;
import com.example.demo.Repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/event")
public class EventController {
   @Autowired
   private EventService eser;
   @Autowired
   private EventRepository erepo;
   @PostMapping("/crate")
   public Event saveEvent(@RequestBody Event eve)
   {
    return eser.addEvent(eve);
   }
   @GetMapping("/events")
   public List<Event> getallEvent()
   {
     return eser.getevent();
   }
   @PutMapping("/updte/{id}")
   public Event modifyEvent(@PathVariable int id,@RequestBody Event e)
   {
    return eser.updateEvent(id,e);
   }
   @DeleteMapping("/deete/{id}")
   public String deleteEvent(@PathVariable int id)
   {
    return eser.deleteEvent(id);
   }
   @GetMapping("/get/{name}")
   public Event geteventname(@PathVariable String name)
   {
     return eser.getbyname(name);
   }
   @GetMapping("/eventdate")
   public List<Event> getbydateofevent()
   {
    return erepo.findbyeventwithdateofevent();
   }
     
}










