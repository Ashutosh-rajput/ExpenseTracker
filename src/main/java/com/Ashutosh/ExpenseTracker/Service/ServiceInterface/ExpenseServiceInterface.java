package com.Ashutosh.ExpenseTracker.Service.ServiceInterface;

import com.Ashutosh.ExpenseTracker.DTO.ExpenseDTO;
import com.Ashutosh.ExpenseTracker.DTO.UserInfoDTO;

import java.util.List;

public interface ExpenseServiceInterface {


    ExpenseDTO createExpense(ExpenseDTO expenseDTO);
    ExpenseDTO getexpensebyid(Long id);
    List<ExpenseDTO> getallExpense();
    ExpenseDTO updateexpense (ExpenseDTO expenseDTO, Long id);
    ExpenseDTO deleteexpense(Long id);
    List<ExpenseDTO> getExpensesByUserId(Long userId);
}
