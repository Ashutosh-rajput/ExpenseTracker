package com.Ashutosh.ExpenseTracker.DTO;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EarningDTO {
    private Long earning_id;
    private String earning_name;
    private Double total_amount;
    private boolean isRecurring;
    private LocalDate date;
    private LocalDateTime createdAt;
}
