package com.Ashutosh.ExpenseTracker.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Expense")
public class Expense {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long expense_id;
        @Column(name = "Amount", nullable = false)
        private Double amount;
        @Column(name = "Date", nullable = false)
        private LocalDateTime createdAt;
        private String description;

        @PrePersist
        protected void onCreate() {
                createdAt = LocalDateTime.now();
        }


//        @ManyToOne
//        @JoinColumn(name = "user_id")
//        private UserInfo userInfo;
//
//        @ManyToOne
//        @JoinColumn(name = "budget_id")
//        private Budget budget;




    }


