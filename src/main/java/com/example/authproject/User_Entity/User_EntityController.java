package com.example.authproject.User_Entity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class User_EntityController {

    private static final List<User_Entity> USERS= Arrays.asList(
            new User_Entity(1, "Jules Julien"),
            new User_Entity(2, "Maria Mary"),
            new User_Entity(3, "Will Smith")
    );
    @GetMapping(path = "{userId}")
    public User_Entity getUser_Entity(@PathVariable("userId") Integer userId ){
        return USERS.stream() //  stream ne stocke pas de données transférer d’une source "array" vers une suite d’opérations.
                .filter(student -> userId.equals(student.getUserId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        "Student " + userId + " does not exists"
                ));
    }
}
