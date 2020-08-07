package io.johancamilo.delilahrestobackend.services.user;

import io.johancamilo.delilahrestobackend.model.User;

import java.util.List;

public interface UserServices {

    User getUserById(int id);

    List<User> getUsers();

    int saveUser(User user);

    int deleteUserById(int id);

    User getUserByUserName(String userName);
}
