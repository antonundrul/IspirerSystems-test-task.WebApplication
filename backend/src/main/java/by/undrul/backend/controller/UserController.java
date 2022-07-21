package by.undrul.backend.controller;


import by.undrul.backend.dto.UserDto;
import by.undrul.backend.mapper.UserMapper;
import by.undrul.backend.model.ListUsr;
import by.undrul.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    private ListUsr<User> users = new ListUsr<>();

    @GetMapping("users")
    public List<User> getUsers() {
     return this.users.castToList();
    }

    @GetMapping("createUser")
    public UserDto createUser() {
       User newUser = new User("Anton", 21);
       users.add(newUser);

        return userMapper.mapToDto(newUser);
    }
}
