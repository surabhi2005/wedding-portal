package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.example.demo.Entity.Booking;
public interface BookingRepository extends JpaRepository<Booking,Integer> {
    Booking findByeventid(int eid);
    Booking findByvendorid(int venid);
    @Query("SELECT bo FROM Booking bo WHERE bo.cost<:costs")
    List<Booking> findbycostlesser(@Param ("costs") int costs);
}
