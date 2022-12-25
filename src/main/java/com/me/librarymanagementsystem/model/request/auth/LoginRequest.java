package com.me.librarymanagementsystem.model.request.auth;

import com.me.librarymanagementsystem.enums.Role;
import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
    private Role role;

}
