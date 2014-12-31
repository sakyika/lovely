package com.sakk.lovely.dao;

import java.util.List;

import com.sakk.lovely.model.User;
import com.sakk.lovely.model.exceptions.DuplicateUserException;
import com.sakk.lovely.model.exceptions.UserNotFoundException;

public interface UserDAO {

	public void addUser(User user) throws DuplicateUserException;

	public User getUser(int userId) throws UserNotFoundException;

	public User getUser(String username) throws UserNotFoundException;

	public void updateUser(User user) throws UserNotFoundException,
			DuplicateUserException;

	public void deleteUser(int userId) throws UserNotFoundException;

	public List<User> getUsers();

}