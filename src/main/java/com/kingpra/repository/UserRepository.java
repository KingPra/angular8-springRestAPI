package com.kingpra.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kingpra.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
