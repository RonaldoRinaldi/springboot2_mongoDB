package com.ronaldo.projectmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ronaldo.projectmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
