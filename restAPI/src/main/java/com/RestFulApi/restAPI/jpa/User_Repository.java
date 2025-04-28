package com.RestFulApi.restAPI.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RestFulApi.restAPI.user.User;

public interface User_Repository extends JpaRepository <User,Integer>{

}
