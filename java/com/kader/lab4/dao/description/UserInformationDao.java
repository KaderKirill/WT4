package com.kader.lab4.dao.description;

import com.kader.lab4.dao.Dao;
import com.kader.lab4.entity.UserInformation;
import com.kader.lab4.exeptions.DaoException;


public interface UserInformationDao extends Dao<UserInformation> {

    void updateById(int id, UserInformation userInformation) throws DaoException;
}
