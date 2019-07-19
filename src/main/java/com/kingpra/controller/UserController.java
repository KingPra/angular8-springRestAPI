package com.kingpra.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingpra.model.User;
import com.kingpra.repository.UserRepository;

@RestController
// not always necessary but helps with CORS. The annotation enables Cross-Origin
// Resource Sharing
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	// production code should implement Spring Boot Validation
	private final UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getUsers() {
		return (List<User>) userRepository.findAll();
	}

	@PostMapping("/users")
	void addUser(@RequestBody User user) {
		userRepository.save(user);
	}

}
