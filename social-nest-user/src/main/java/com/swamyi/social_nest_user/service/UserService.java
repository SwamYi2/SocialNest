package com.swamyi.social_nest_user.service;

import com.swamyi.social_nest_user.domain.User;
import com.swamyi.social_nest_user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService{

    private final UserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
