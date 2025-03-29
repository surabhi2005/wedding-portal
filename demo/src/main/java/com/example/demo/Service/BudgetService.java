package com.example.demo.Service;
import com.example.demo.Entity.Budget;
import com.example.demo.Repository.BudgetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class BudgetService {
    @Autowired
    BudgetRepository burepo;
    public Budget addBudget(Budget bu)
    {
        return burepo.save(bu);
    }
    public List<Budget> getBudget()
    {
        return burepo.findAll();
    }
    public Budget updateBudget(int id,Budget b)
    {
        b.setBudgetid(id);
        return burepo.save(b);
    }
    public String deleteBudget(int id)
    {
        burepo.deleteById(id);
        return "Successfully deleted";
    } 
    public Page<Budget> getbudgetbypage(int page,int size,String sortBy,String sortDirection)
    {
        Pageable pa=PageRequest.of(page,size,Sort.by("totalbudget").ascending());
        return burepo.findAll(pa);
    }
    public List<Budget> getbytotalbudget(int totbudget)
    {
        return burepo.findbytotalbudgetgreater(totbudget);
    }
}



