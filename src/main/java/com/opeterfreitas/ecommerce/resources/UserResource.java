package com.opeterfreitas.ecommerce.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opeterfreitas.ecommerce.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Peter Oliveira Freitas", "opeterfreitas@gmail.com", "9999999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}