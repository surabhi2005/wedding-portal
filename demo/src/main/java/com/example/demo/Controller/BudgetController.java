package com.example.demo.Controller;
import com.example.demo.Entity.Budget;
import com.example.demo.Service.BudgetService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/budget")
public class BudgetController{
   @Autowired
   private BudgetService buser;
   @PostMapping("/creates")
   public Budget saveBudget(@RequestBody Budget bu)
   {
    return buser.addBudget(bu);
   }
   @GetMapping("/budgets")
   public List<Budget> getallBudget()
   {
     return buser.getBudget();
   }
   @PutMapping("/udate/{id}")
   public Budget modifyBudget(@PathVariable int id,@RequestBody Budget bu)
   {
    return buser.updateBudget(id,bu);
   }
   @DeleteMapping("/elete/{id}")
   public String deleteBudget(@PathVariable int id)
   {
    return buser.deleteBudget(id);
   } 
   @GetMapping("/pagg")
   public Page<Budget> getbudgetpage(@RequestParam (defaultValue = "0")int page,@RequestParam (defaultValue = "1")int size,@RequestParam (defaultValue = "totalbudget") String sortBy,@RequestParam (defaultValue = "asc") String sortDirection)
   {
      return buser.getbudgetbypage(page,size,sortBy,sortDirection);
   }  
   @GetMapping("/getbytotalbudget/{totbudget}")
   public List<Budget> getfinalbudget(@PathVariable int totbudget)
   {
    return buser.getbytotalbudget(totbudget);
   }
}



