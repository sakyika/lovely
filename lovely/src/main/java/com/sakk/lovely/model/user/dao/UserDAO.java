package com.sakk.lovely.model.user.dao;

import java.util.List;

import com.sakk.lovely.model.user.User;
import com.sakk.lovely.model.user.Exceptions.DuplicateUserException;
import com.sakk.lovely.model.user.Exceptions.UserNotFoundException;

public interface UserDAO {

	public void addUser(User user) throws DuplicateUserException;

	public User getUser(int userId) throws UserNotFoundException;

	public User getUser(String username) throws UserNotFoundException;

	public void updateUser(User user) throws UserNotFoundException;

	public void deleteUser(int userId) throws UserNotFoundException;

	public List<User> getUsers();

}
