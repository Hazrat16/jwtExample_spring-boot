package com.jwt.jwtExample.sevices;

import com.jwt.jwtExample.modals.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Hazrat Ali","hazrat17016@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Monir john","john@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Mahade Hasan","mahade@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Partha Sen","sen@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
