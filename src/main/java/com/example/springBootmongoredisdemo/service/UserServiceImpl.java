package com.example.springBootmongoredisdemo.service;
import com.example.springBootmongoredisdemo.model.User;
import com.example.springBootmongoredisdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    private RedisTemplate redisTemplate;

    public UserServiceImpl(UserRepository userRepository, RedisTemplate redisTemplate) {
        this.userRepository = userRepository;
        this.redisTemplate = redisTemplate;
    }


    @Override
    public void save(User user) {
//        return userRepository.save(user);
        redisTemplate.opsForValue().set("users:" + user.getId(), user);


    }



    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(Integer id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null;

    }
}
