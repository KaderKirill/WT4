package com.kader.lab4.dao.mapper;

import com.kader.lab4.entity.Identifiable;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T extends Identifiable> {


    T map(ResultSet resultSet) throws SQLException;
}