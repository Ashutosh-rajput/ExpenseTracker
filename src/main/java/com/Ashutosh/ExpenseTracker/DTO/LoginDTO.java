package com.Ashutosh.ExpenseTracker.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginDTO {
    private String username;
    private String password;
}
