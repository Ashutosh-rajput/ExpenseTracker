package com.Ashutosh.ExpenseTracker.DTO;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BudgetDTO {

        private Long budget_id;
        private String budget_name;
        private Double amount_limit;
        private LocalDateTime createdAt;

}
