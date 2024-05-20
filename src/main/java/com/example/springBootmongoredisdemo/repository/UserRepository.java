package com.example.springBootmongoredisdemo.repository;

import com.example.springBootmongoredisdemo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {
}
