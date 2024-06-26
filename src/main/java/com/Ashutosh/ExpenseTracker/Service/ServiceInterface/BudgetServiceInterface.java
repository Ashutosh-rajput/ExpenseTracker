package com.Ashutosh.ExpenseTracker.Service.ServiceInterface;

import com.Ashutosh.ExpenseTracker.DTO.BudgetDTO;
import com.Ashutosh.ExpenseTracker.DTO.ExpenseDTO;

import java.util.List;

public interface BudgetServiceInterface {
        BudgetDTO createBudget(BudgetDTO budgetDTO);
        BudgetDTO getBudgetById(Long id);
        List<BudgetDTO> getAllBudgets();
        BudgetDTO updateBudget(BudgetDTO budgetDTO, Long id);
        BudgetDTO deleteBudget(Long id);
        List<BudgetDTO> getBudgetByUserId(Long userId);
    }


