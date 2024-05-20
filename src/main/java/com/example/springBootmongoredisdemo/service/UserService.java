package com.example.springBootmongoredisdemo.service;



import com.example.springBootmongoredisdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void save(User user);
    User findById(Integer id);
    List<User> findAll();
    void delete(Integer id);
    User update(Integer id, User user);

}
