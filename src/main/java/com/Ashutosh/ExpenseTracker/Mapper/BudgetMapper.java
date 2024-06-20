package com.Ashutosh.ExpenseTracker.Mapper;

import com.Ashutosh.ExpenseTracker.DTO.BudgetDTO;
import com.Ashutosh.ExpenseTracker.Entity.Budget;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class BudgetMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Budget budgetDTOtoBudget(BudgetDTO budgetDTO){
        Budget budget = modelMapper.map(budgetDTO, Budget.class);
        return budget;
    }

    public BudgetDTO budgetToBudgetDTO(Budget budget){
        BudgetDTO budgetDTO = modelMapper.map(budget, BudgetDTO.class);
        return budgetDTO;
    }


}
