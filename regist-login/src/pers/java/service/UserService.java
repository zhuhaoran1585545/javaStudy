package pers.java.service;

import java.util.List;

import pers.java.domain.User;

public interface UserService {
	public void regist(List<User> userList,User user);
	public User login(List<User> userList,User user);
}
