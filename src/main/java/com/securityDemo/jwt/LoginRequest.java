package com.securityDemo.jwt;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginRequest {

    private String username;
    private String password;
}
