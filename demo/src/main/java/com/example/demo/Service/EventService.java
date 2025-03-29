// package com.example.demo.Service;
// import com.example.demo.Entity.Event;
// import com.example.demo.Repository.EventRepository;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// @Service
// public class EventService {
//     @Autowired
//     EventRepository erepo;
//     public Event addEvent(Event e)
//     {
//         return erepo.save(e);
//     }
//     public List<Event> getevent()
//     {
//         return erepo.findAll();
//     }
//     public Event updateEvent(int id,Event e)
//     {
//         e.setId(id);
//         return erepo.save(e);
//     }
//     public String deleteEvent(int id)
//     {
//         erepo.deleteById(id);
//         return "Successfully deleted";
//     }
//     public Event getbyname(String name)
//     {
//         return erepo.findByname(name);
//     }
    
// }

package com.example.demo.Service;
import com.example.demo.Entity.Budget;
import com.example.demo.Entity.Event;
import com.example.demo.Repository.BudgetRepository;
import com.example.demo.Repository.EventRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EventService {
    @Autowired
    EventRepository erepo;
    @Autowired
    BudgetRepository burepo;

    public Event addEvent(Event e)
    {
        return erepo.save(e);
    }
    public List<Event> getevent()
    {
        return erepo.findAll();
    }
    public Event updateEvent(int id, Event e) {
        Optional<Event> existingEventOpt = erepo.findById(id);
        
        if (existingEventOpt.isPresent()) {
            Event eventToUpdate = existingEventOpt.get();
            if (e.getName() != null) eventToUpdate.setName(e.getName());
            if (e.getDateofevent() != null) eventToUpdate.setDateofevent(e.getDateofevent());
            if (e.getLocation() != null) eventToUpdate.setLocation(e.getLocation());
            if (e.getMealtype() != null) eventToUpdate.setMealtype(e.getMealtype());
            if (e.getBudget() != null) {
                Budget existingBudget = eventToUpdate.getBudget(); 
                
                if (existingBudget != null) {
                    if (e.getBudget().getTotalbudget() > 0) 
                        existingBudget.setTotalbudget(e.getBudget().getTotalbudget());
                    
                    if (e.getBudget().getSpentamount() >= 0) 
                        existingBudget.setSpentamount(e.getBudget().getSpentamount());
                    existingBudget.setRemainingamount(existingBudget.getTotalbudget() - existingBudget.getSpentamount());
                    burepo.save(existingBudget);
                }
            }
    
            return erepo.save(eventToUpdate); 
        }
        return null; 
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

