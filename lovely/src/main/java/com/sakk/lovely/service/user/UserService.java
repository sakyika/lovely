package com.sakk.lovely.service.user;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.sakk.lovely.model.User;
import com.sakk.lovely.model.exceptions.DuplicateUserException;
import com.sakk.lovely.model.exceptions.UserNotFoundException;

public interface UserService extends UserDetailsService {

	public void addUser(User user) throws DuplicateUserException;

	public User getUser(int userId) throws UserNotFoundException;

	public User getUser(String username) throws UserNotFoundException;

	public void updateUser(User user) throws UserNotFoundException;

	public void deleteUser(int userId) throws UserNotFoundException;

	public List<User> getUsers();
}