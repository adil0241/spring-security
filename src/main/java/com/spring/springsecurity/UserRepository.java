package com.spring.springsecurity;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<user, Long> {
	user findByUsername(String username);
}
