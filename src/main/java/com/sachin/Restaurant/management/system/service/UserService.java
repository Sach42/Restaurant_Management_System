package com.sachin.Restaurant.management.system.service;

import com.sachin.Restaurant.management.system.exception.NotFoundException;
import com.sachin.Restaurant.management.system.model.User;
import com.sachin.Restaurant.management.system.repository.IUserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final IUserRepo userRepo;

    public UserService(IUserRepo userRepository) {
        this.userRepo = userRepository;
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUserById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

    public User getUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
