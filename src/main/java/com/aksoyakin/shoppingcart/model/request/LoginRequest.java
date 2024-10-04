package com.aksoyakin.shoppingcart.model.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank
    private String email;   //actually email is a username!
    @NotBlank
    private String password;
}
