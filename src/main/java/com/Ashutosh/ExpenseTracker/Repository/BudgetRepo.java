package com.Ashutosh.ExpenseTracker.Repository;

import com.Ashutosh.ExpenseTracker.Entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BudgetRepo extends JpaRepository<Budget,Long> {
    List<Budget> findByUserInfo_userid(Long userId);
}

