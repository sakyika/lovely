package com.sakk.lovely.model.dao;

import java.util.List;

import com.sakk.lovely.model.Permission;
import com.sakk.lovely.model.exceptions.DuplicatePermissionException;
import com.sakk.lovely.model.exceptions.PermissionNotFoundException;

public interface PermissionDAO {

    public void addPermission(Permission permission) throws DuplicatePermissionException;

    public Permission getPermission(int id) throws PermissionNotFoundException;

    public Permission getPermission(String permissionName) throws PermissionNotFoundException;

    public void updatePermission(Permission permission) throws PermissionNotFoundException, DuplicatePermissionException;

    public void deletePermission(int id) throws PermissionNotFoundException;

    public List<Permission> getPermissions();

}
