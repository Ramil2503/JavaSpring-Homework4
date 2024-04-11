package org.example.javaspringhomework4.repository;

import lombok.Getter;
import org.example.javaspringhomework4.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@Repository
public class UserRepository {
    List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }
}
