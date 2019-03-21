package com.gupaoedu.e_template;

import java.sql.ResultSet;

public interface RowMapper<T> {

    T mapRow(ResultSet resultSet, int rowNum) throws Exception;
}
