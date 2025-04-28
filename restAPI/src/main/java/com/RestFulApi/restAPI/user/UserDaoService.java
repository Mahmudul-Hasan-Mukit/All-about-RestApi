package com.RestFulApi.restAPI.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
private static List<User>users=new ArrayList<>();
private static int usersCount=0;
static {
	users.add(new User(++usersCount,"Mukit",LocalDate.now().minusYears(27)));
	users.add(new User(++usersCount,"Moli",LocalDate.now().minusYears(33)));
	users.add(new User(++usersCount,"Mozibur",LocalDate.now().minusYears(63)));
	users.add(new User(++usersCount,"Muhsin",LocalDate.now().minusYears(7)));
	}
public List<User>findAll(){
	return users;
}
public User findUser(int id) {
  for(User user:users) {
	 if(user.getId()==id) {
		 return user;
	 }
  }
  return null;
}

public List<User> DeleteUser(int id) {
	  for(User user:users) {
		 if(user.getId()==id) {
			  users.remove(user);
		 }
	  }
	  return users;
	}
public User save(User user) {
	user.setId(++usersCount);
	users.add(user);
	return user;
}
}	

