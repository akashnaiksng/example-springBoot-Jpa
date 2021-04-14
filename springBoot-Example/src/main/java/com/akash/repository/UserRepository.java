package com.akash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akash.model.UserRecord;
@Repository
public interface UserRepository extends CrudRepository<UserRecord, Integer>{

}
