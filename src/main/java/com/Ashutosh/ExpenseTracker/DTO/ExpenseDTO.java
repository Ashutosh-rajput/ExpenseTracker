package com.Ashutosh.ExpenseTracker.DTO;



import lombok.*;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ExpenseDTO {
    private Long expense_id;
    private Double amount;
    private LocalDateTime createdAt;
    private String description;
}
