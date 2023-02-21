package com.marketplace.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marketplace.entity.User;

public interface UserRepository extends MongoRepository<User, Long>{

}
