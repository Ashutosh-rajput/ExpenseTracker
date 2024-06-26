package com.Ashutosh.ExpenseTracker.DTO;



import com.Ashutosh.ExpenseTracker.Entity.Budget;
import com.Ashutosh.ExpenseTracker.Entity.UserInfo;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ExpenseDTO {
    private Long expenseid;
    private Double amount;
    private LocalDateTime createdAt;
    private String description;


    private UserInfo userInfo;


    private Budget budget;
}
