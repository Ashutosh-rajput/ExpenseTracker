package com.Ashutosh.ExpenseTracker.Entity;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

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
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
        @SequenceGenerator(name = "seq",sequenceName = "ex_seq",allocationSize = 1)
        private Long expense_id;
        @Column(name = "Amount", nullable = false)
        private Double amount;
        @Column(name = "Date", nullable = false)
        @CreationTimestamp
        private LocalDateTime createdAt;
        private String description;




        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id", referencedColumnName = "user_id")
        private UserInfo userInfo;

        @ManyToOne
        @JoinColumn(name = "budget_id", referencedColumnName = "budget_id")
        private Budget budget;




    }


