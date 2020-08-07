package io.johancamilo.delilahrestobackend.services.user;

import io.johancamilo.delilahrestobackend.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicesMemoryImpl implements UserServices{

    private ArrayList<User> users = new ArrayList<>();

    @Override
    public User getUserById(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public int saveUser(User user) {
        users.add(user);

        return user.getId();
    }

    @Override
    public int deleteUserById(int id) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (users.get(i).getId() == id) {
                users.remove(user);
                return user.getId();
            }
        }

        return -1;
    }

    @Override
    public User getUserByUserName(String userName) {
        for (User user: users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }

        return null;
    }
}
