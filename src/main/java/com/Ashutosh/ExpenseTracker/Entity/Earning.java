package com.Ashutosh.ExpenseTracker.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Earnings")
public class Earning {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long earning_id;
        private String earning_name;
        @Column(nullable = false)
        private Double total_amount;
        private boolean isRecurring;
        private LocalDate date;
        private LocalDateTime createdAt;
        @PrePersist
        protected void onCreate() {
                createdAt = LocalDateTime.now();
        }

//        @OneToOne
//        @JoinColumn(name = "user_id")
//        private UserInfo userInfo;

        // getters and setters


}
