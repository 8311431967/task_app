package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Override
    List<User> findAll();
    User findById(Long id);
    User findByUserName(String name);
    User findByFirstName(String name);
}
