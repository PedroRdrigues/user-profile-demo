package com.userprofile.user_profile_demo.service;

import com.userprofile.user_profile_demo.domain.User;
import com.userprofile.user_profile_demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
