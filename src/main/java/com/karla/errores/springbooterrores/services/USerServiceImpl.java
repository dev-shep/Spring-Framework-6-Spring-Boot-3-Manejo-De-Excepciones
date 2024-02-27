package com.karla.errores.springbooterrores.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.karla.errores.springbooterrores.models.domain.User;

@Service
public class USerServiceImpl implements UserService {
    private List<User> users;
    
    public USerServiceImpl(){
            this.users = new ArrayList<>();
            users.add(new User("pepe","Gonzales",1L));
            users.add(new User("pepe","Gonzales",2L));
            users.add(new User("pepe","Gonzales",3L));
            users.add(new User("pepe","Gonzales",4L));
            users.add(new User("pepe","Gonzales",5L));
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u: users) {
            if(u.getId().equals(id)){
                user = u;
                break;
            }
        }

        return Optional.ofNullable(user);
    }

    @Override
    public List<User> findAll() {
        return users;
    }

}
