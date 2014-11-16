package com.sakk.lovely.model.role.dao;

import java.util.List;

import com.sakk.lovely.model.role.Role;
import com.sakk.lovely.model.role.Exceptions.DuplicateRoleException;
import com.sakk.lovely.model.role.Exceptions.RoleNotFoundException;

public interface RoleDAO {

	public void addRole(Role role) throws DuplicateRoleException;

	public Role getRole(int id) throws RoleNotFoundException;

	public Role getRole(String roleName) throws RoleNotFoundException;

	public void updateRole(Role role) throws RoleNotFoundException;

	public void deleteRole(int id) throws RoleNotFoundException;

	public List<Role> getRoles();

}