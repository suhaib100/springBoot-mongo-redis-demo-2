package com.example.springBootmongoredisdemo.repository.redis;

import com.example.springBootmongoredisdemo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRedisRepository extends CrudRepository<User,Integer> {
}
