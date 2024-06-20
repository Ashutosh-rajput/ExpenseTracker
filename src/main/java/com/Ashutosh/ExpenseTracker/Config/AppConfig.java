package com.Ashutosh.ExpenseTracker.Config;

import com.Ashutosh.ExpenseTracker.Mapper.BudgetMapper;
import com.Ashutosh.ExpenseTracker.Mapper.EarningMapper;
import com.Ashutosh.ExpenseTracker.Mapper.ExpenseMapper;
import com.Ashutosh.ExpenseTracker.Mapper.UserInfoMapper;
import com.Ashutosh.ExpenseTracker.Service.ServiceImpl.BudgetServiceImpl;
import com.Ashutosh.ExpenseTracker.Service.ServiceImpl.EarningServiceImpl;
import com.Ashutosh.ExpenseTracker.Service.ServiceImpl.ExpenseServiceImpl;
import com.Ashutosh.ExpenseTracker.Service.ServiceImpl.UserInfoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;

@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    @Bean
    public UserInfoMapper userInfoMapper(){
        return new UserInfoMapper();
    }
    @Bean
    public UserInfoServiceImpl userInfoService(){
        return new UserInfoServiceImpl();
    }

    @Bean
    public EarningMapper earningMapper() {
        return new EarningMapper();
    }

    @Bean
    public EarningServiceImpl earningService() {
        return new EarningServiceImpl();
    }

    @Bean
    public BudgetMapper budgetMapper() {
        return new BudgetMapper();
    }

    @Bean
    public BudgetServiceImpl budgetService() {
        return new BudgetServiceImpl();
    }

    @Bean
    public ExpenseMapper expenseMapper() {
        return new ExpenseMapper();
    }

    @Bean
    public ExpenseServiceImpl expenseService() {
        return new ExpenseServiceImpl();
    }




}
