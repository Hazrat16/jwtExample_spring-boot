package com.jwt.jwtExample.modals;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JwtRequest {

    private String email;

    private String password;
}
