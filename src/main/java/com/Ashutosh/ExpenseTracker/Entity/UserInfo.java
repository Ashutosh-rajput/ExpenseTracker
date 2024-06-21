package com.Ashutosh.ExpenseTracker.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

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
    private Long user_id;

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


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userInfo")
    private Set<Expense> expenses;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userInfo")
    private Set<Budget> budgets;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userInfo")
    private Set<Earning> earnings;
}
