package io.johancamilo.delilahrestobackend.controller;

import io.johancamilo.delilahrestobackend.model.User;
import io.johancamilo.delilahrestobackend.services.user.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userServices.getUsers();
    }

    @GetMapping(value = "/user/userName/{userName}")
    public User getUserByUserName(@PathVariable("userName") @NotBlank String userName) {
        return userServices.getUserByUserName(userName);
    }

    @PostMapping(value = "/user", consumes = "application/json")
    public int createUser(@RequestBody @Valid User user) {
        return userServices.saveUser(user);
    }
}
