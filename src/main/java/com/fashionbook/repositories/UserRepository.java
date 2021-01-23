package com.fashionbook.repositories;

import com.fashionbook.entities.MyUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<MyUser,String> {
}
