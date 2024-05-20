package com.example.springBootmongoredisdemo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "u")
public class User implements Serializable {
    @Id
    private Integer id;
    private String name;
    // Other fields, constructors, getters and setters
}
