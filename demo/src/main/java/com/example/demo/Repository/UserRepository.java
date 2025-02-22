package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import com.example.demo.Entity.User;
public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(int id);
    @Query("SELECT u FROM User u WHERE u.name LIKE 'C%'")
    List<User> findbyuserwithnamestartwithc();
}
