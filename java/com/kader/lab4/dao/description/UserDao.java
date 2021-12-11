package com.kader.lab4.dao.description;

import com.kader.lab4.dao.Dao;
import com.kader.lab4.entity.User;
import com.kader.lab4.exeptions.DaoException;

import java.util.Optional;

public interface UserDao extends Dao<User> {


    Optional<User> findByEmailAndPassword(String email, String password) throws DaoException;


    Optional<User> findByEmail(String email) throws DaoException;
}
