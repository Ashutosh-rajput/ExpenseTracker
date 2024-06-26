package com.Ashutosh.ExpenseTracker.Repository;

import com.Ashutosh.ExpenseTracker.Entity.Budget;
import com.Ashutosh.ExpenseTracker.Entity.Earning;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EarningRepo extends JpaRepository<Earning,Long> {
    List<Earning> findByUserInfo_userid(Long userId);
}
