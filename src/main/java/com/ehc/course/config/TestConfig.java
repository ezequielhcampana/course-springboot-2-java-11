package com.ehc.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ehc.course.entities.Category;
import com.ehc.course.entities.Order;
import com.ehc.course.entities.User;
import com.ehc.course.entities.enums.OrderStatus;
import com.ehc.course.repositories.CategoryRepository;
import com.ehc.course.repositories.OrderRepository;
import com.ehc.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CategoryRepository categoryRepository;	

	@Override
	public void run(String... args) throws Exception {
		
		// category...
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		// users...
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "987654");
		User u3 = new User(null, "Bob Gray", "bob@gmail.com", "16997854789", "159951");
		User u4 = new User(null, "John Black", "john@gmail.com", "18998744588", "357753");
		
		// orders...
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		Order o4 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u3);
		Order o5 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.SHIPPED, u3);
		Order o6 = new Order(null, Instant.parse("2019-10-22T15:21:22Z"), OrderStatus.CANCELED, u4);
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5, o6));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		
	}
	
}
