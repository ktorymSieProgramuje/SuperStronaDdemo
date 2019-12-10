package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private UserRepository userRepository;

    @Autowired
    public DatabaseSeeder(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<User> users = new ArrayList<>();

        users.add(new User("George", "Washington", "aaaaaaaaaa","1999/12/12"));
        users.add(new User("John", "Adams", "bbbbbbbbbb","2000/12/12"));
        users.add(new User("Thomas", "Jefferson", "ccccccccc","1989/12/12"));

        userRepository.saveAll(users);
    }
}
