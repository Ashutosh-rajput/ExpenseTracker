package com.Ashutosh.ExpenseTracker.DTO;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {
        private Long userId;
        private String username;
        private String password;
        private String email;
        private String fullName;
        private Long mobile;

}
