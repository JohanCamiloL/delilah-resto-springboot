package io.johancamilo.delilahrestobackend.model;

import org.springframework.stereotype.Component;

import javax.validation.constraints.*;

@Component
public class User {

    private int id;

    @NotBlank
    private String userName;

    @NotBlank
    private String fullName;

    @Email
    private String email;

    @Max(10)
    @Min(10)
    @NotNull
    private int phone;

    @NotBlank
    private String address;

    @NotBlank
    private String password;

    public User() {
    }

    public User(@NotBlank String userName, @NotBlank String fullName, @Email String email,
                @Max(10) @Min(10) @NotNull int phone, @NotBlank String address, @NotBlank String password) {
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
