package com.Ashutosh.ExpenseTracker.Service.ServiceImpl;

import com.Ashutosh.ExpenseTracker.DTO.ExpenseDTO;
import com.Ashutosh.ExpenseTracker.Entity.Expense;
import com.Ashutosh.ExpenseTracker.ExceptionHandler.ResourceNotFoundException;
import com.Ashutosh.ExpenseTracker.Mapper.ExpenseMapper;
import com.Ashutosh.ExpenseTracker.Repository.ExpenseRepo;
import com.Ashutosh.ExpenseTracker.Service.ServiceInterface.ExpenseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseServiceInterface {

    @Autowired
    private ExpenseMapper expenseMapper;
    @Autowired
    private ExpenseRepo expenseRepo;
    @Override
    public ExpenseDTO createExpense(ExpenseDTO expenseDTO) {
        Expense expense=expenseMapper.expenseDTOtoExpense(expenseDTO);
        Expense savedexpense=expenseRepo.save(expense);
        return expenseMapper.expenseToExpenseDTO(savedexpense);
    }

    @Override
    public ExpenseDTO getexpensebyid(Long id) {
        Expense expense=expenseRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException(("Expense with the is does not exists "+id)));
        return expenseMapper.expenseToExpenseDTO(expense);
    }

    @Override
    public List<ExpenseDTO> getallExpense() {
        List<Expense> expenses=expenseRepo.findAll();
        return expenses.stream().map((expense) ->expenseMapper.expenseToExpenseDTO(expense)).toList();
    }

    @Override
    public ExpenseDTO updateexpense(ExpenseDTO expenseDTO, Long id) {
        Expense expense=expenseRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException(("Expense with the is does not exists "+id)));
        expense.setAmount(expenseDTO.getAmount());
        expense.setDescription(expenseDTO.getDescription());
        Expense updatedexpense=expenseRepo.save(expense);
        return expenseMapper.expenseToExpenseDTO(updatedexpense);

    }

    @Override
    public ExpenseDTO deleteexpense(Long id) {
        Expense expense=expenseRepo.findById(id).orElseThrow(()->
                new ResourceNotFoundException(("Expense with the is does not exists "+id)));
        expenseRepo.delete(expense);
        return expenseMapper.expenseToExpenseDTO(expense);
    }
}
