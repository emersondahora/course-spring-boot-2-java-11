package com.emersondahora.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emersondahora.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
