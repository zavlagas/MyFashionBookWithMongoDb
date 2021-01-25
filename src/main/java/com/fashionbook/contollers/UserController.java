package com.fashionbook.contollers;


import com.fashionbook.entities.MyUser;
import com.fashionbook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/all")
    public List<MyUser> getAllUsers(){
        List<MyUser> users = userRepo.findAll();
        return users;
    }
}
