package com.springboot.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.springboot.model.FriendList;

public interface FriendRepository extends CrudRepository<FriendList, Serializable> {

}
