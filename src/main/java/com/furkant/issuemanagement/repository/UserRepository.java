package com.furkant.issuemanagement.repository;

import com.furkant.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
