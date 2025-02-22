package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.example.demo.Entity.Event;
public interface EventRepository extends JpaRepository<Event,Integer> {
    Event findByname(String name);
    @Query("SELECT e FROM Event e WHERE e.dateofevent LIKE '2025%'")
    List<Event> findbyeventwithdateofevent();
}
