package com.rh.websocketdemo.dao;

import com.rh.websocketdemo.model.Status;
import com.rh.websocketdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
