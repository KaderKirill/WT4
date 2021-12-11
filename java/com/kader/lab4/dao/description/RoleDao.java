package com.kader.lab4.dao.description;

import com.kader.lab4.dao.Dao;
import com.kader.lab4.entity.Role;
import com.kader.lab4.exeptions.DaoException;

import java.util.Optional;

public interface RoleDao extends Dao<Role> {


    Optional<Role> findByName(String name) throws DaoException;
}