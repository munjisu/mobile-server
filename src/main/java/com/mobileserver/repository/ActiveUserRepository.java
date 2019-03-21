package com.mobileserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActiveUserRepository extends MongoRepository<ActiveUser, String> {

}
