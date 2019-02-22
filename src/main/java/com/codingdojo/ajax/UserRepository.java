package com.codingdojo.ajax;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.ajax.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
