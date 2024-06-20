package com.Ashutosh.ExpenseTracker.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tbl_UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq")
    @SequenceGenerator(name = "seq",sequenceName = "ex_seq",allocationSize = 1)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "mobile", nullable = false, unique = true)
    private Long mobile;

//    @Column(name = "dob", nullable = false)
//    private String dob;
//    @OneToMany(mappedBy = "user")
//    private List<Expense> expenses;
//
//    @OneToMany(mappedBy = "user")
//    private List<Budget> budgets;
//
//    @OneToMany(mappedBy = "user")
//    private List<Earning> earnings;
}
