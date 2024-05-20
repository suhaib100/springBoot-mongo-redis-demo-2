package com.example.springBootmongoredisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableRedisRepositories
public class SpringBootMongoRedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoRedisDemoApplication.class, args);
	}

}
