package com.challenge.service;

import com.challenge.entity.User;
import com.challenge.repository.UserRepository;
import com.challenge.service.interfaces.UserServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository repository;

    /*public UserService(UserRepository repository){
        this.repository = repository;
    }*/

    @Override
    public Optional<User> findById(Long userId) {
        return repository.findById(userId);
    }

    @Override
    public List<User> findByAccelerationName(String name) {
        return repository.findByCandidatesIdAccelerationName(name);
    }

    @Override
    public List<User> findByCompanyId(Long companyId) {
        return repository.findByCandidatesIdCompanyId(companyId);
    }

    @Override
    public User save(User object) {
        //user.setCreatedAt(LocalDateTime.now());
        return repository.save(object);
    }
}
