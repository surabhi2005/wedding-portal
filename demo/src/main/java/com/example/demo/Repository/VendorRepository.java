package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.example.demo.Entity.Vendor;
public interface VendorRepository extends JpaRepository<Vendor,Integer> {
    Vendor findByname(String name);
    @Query("SELECT v FROM Vendor v WHERE v.services=:service")
    List<Vendor> findbyservices(@Param ("service") String service);
}
