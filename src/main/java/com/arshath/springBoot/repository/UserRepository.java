package com.arshath.springBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arshath.springBoot.entity.*;

public interface UserRepository extends JpaRepository<User,Integer> {

}
