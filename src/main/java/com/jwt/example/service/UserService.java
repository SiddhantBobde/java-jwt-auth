package com.jwt.example.service;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class UserService {
    private ArrayList<User> store = new ArrayList<User>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Siddhant Bobde", "siddhantbobde123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Amruta Bobde", "amrutabobdetest@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "John Doe", "johndoe@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Iron Man", "ironman@gmail.com"));
    }

    public ArrayList<User> getUsers() {
        return this.store;
    }
}
