package com.ynz.actuator.securitydomain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Login {
    private String username;
    private String password;
}
