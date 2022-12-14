package com.me.librarymanagementsystem.model.request.admin;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class AdminCreateRequest {


    @NotBlank(message = "Full name is mandatory")
    private String fullName;

    @Pattern(regexp = "[a-z\\d!#$%&'*+=?^_`{|}~-]+(?:\\.[a-z\\d!#$%&'*+=?^_`{|}~-]+)*@(?:[a-z\\d](?:[a-z\\d-]*[a-z\\d])?\\.)+[a-z\\d](?:[a-z\\d-]*[a-z\\d])?",
            message = "Email is invalid")
    private String email;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 8)
    private String password;




}
