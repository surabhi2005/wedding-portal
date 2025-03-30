package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.example.demo.Entity.Budget;
public interface BudgetRepository extends JpaRepository<Budget,Integer> {
    @Query("SELECT b FROM Budget b WHERE b.totalbudget > :totbudget")
    List<Budget> findbytotalbudgetgreater(@Param ("totbudget") int totbudget);
}

