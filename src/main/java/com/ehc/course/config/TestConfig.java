package com.ehc.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ehc.course.entities.User;
import com.ehc.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "987654");
		User u3 = new User(null, "Bob Gray", "bob@gmail.com", "16997854789", "159951");
		User u4 = new User(null, "John Black", "john@gmail.com", "18998744588", "357753");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
	}
	
}
