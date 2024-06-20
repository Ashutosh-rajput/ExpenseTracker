package com.Ashutosh.ExpenseTracker.Entity;
import jakarta.persistence.*;
import lombok.*;
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
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long budget_id;
        @Column(nullable = false)
        private String budget_name;
        private Double amount_limit;
        private LocalDateTime createdAt;
        @PrePersist
        protected void onCreate() {
                createdAt = LocalDateTime.now();
        }


//        @ManyToOne
//        @JoinColumn(name = "user_id")
//        private UserInfo userInfo;
//
//        @OneToMany(mappedBy = "budget")
//        private List<Expense> expenses;

        // getters and setters
    }


