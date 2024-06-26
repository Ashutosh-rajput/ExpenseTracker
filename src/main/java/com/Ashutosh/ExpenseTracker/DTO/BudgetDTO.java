package com.Ashutosh.ExpenseTracker.DTO;

import com.Ashutosh.ExpenseTracker.Entity.Expense;
import com.Ashutosh.ExpenseTracker.Entity.UserInfo;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BudgetDTO {

        private Long budgetid;
        private String budgetname;
        private Double amountlimit;
        private LocalDateTime createdAt;


        private UserInfo userInfo;


//        private List<Expense> expenses;

}
