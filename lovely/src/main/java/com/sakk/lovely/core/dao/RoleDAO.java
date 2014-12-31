package com.sakk.lovely.core.dao;

import java.util.List;

import com.sakk.lovely.core.exceptions.DuplicateRoleException;
import com.sakk.lovely.core.exceptions.RoleNotFoundException;
import com.sakk.lovely.core.model.Role;

public interface RoleDAO {

	public void addRole(Role role) throws DuplicateRoleException;

	public Role getRole(int id) throws RoleNotFoundException;

	public Role getRole(String roleName) throws RoleNotFoundException;

	public void updateRole(Role role) throws RoleNotFoundException;

	public void deleteRole(int id) throws RoleNotFoundException;

	public List<Role> getRoles();

}