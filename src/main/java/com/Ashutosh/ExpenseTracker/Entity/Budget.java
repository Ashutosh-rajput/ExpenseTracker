package com.Ashutosh.ExpenseTracker.Entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
@Table(name = "Budget")
@AllArgsConstructor
@NoArgsConstructor
public class Budget {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
        @SequenceGenerator(name = "seq",sequenceName = "ex_seq",allocationSize = 1)
        private Long budget_id;
        @Column(nullable = false)
        private String budget_name;
        private Double amount_limit;
        @CreationTimestamp
        private LocalDateTime createdAt;

        @OneToOne
        @JoinColumn(name = "user_id")
        private UserInfo userInfo;

        @OneToMany(mappedBy = "budget")
        private List<Expense> expenses;


    }
















