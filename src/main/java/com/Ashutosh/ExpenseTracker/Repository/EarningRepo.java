package com.Ashutosh.ExpenseTracker.Repository;

import com.Ashutosh.ExpenseTracker.Entity.Earning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningRepo extends JpaRepository<Earning,Long> {
}
