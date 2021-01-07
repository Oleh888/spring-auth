package com.example.springauth.dto;

import com.example.springauth.model.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationFormDto {
    private String userName;
    private String password;
    private String fullName;
    private String phoneNumber;

    public User toUser(PasswordEncoder encoder) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(encoder.encode(password));
        user.setFullName(fullName);
        user.setPhoneNumber(phoneNumber);
        return user;
    }
}
