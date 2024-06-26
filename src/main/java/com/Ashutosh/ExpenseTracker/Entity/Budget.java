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
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Budget {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
        @SequenceGenerator(name = "seq",sequenceName = "ex_seq",allocationSize = 1)
        private Long budgetid;
        @Column
        private String budgetname;
        private Double amountlimit;
        @CreationTimestamp
        private LocalDateTime createdAt;

        @ManyToOne
        @JoinColumn(name = "userid", referencedColumnName = "userid")
        private UserInfo userInfo;

//        @OneToMany(mappedBy = "budget")
//        private List<Expense> expenses;


    }
















