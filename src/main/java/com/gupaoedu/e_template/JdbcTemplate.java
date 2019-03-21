package com.gupaoedu.e_template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List executeQuery(String sql, Object [] values, RowMapper rowMapper) throws Exception {
        //建立连接
        Connection connection = this.getConnection();
        //构建语句集
        PreparedStatement pstm = this.createPrepareStatement(connection,sql);
        //执行语句集
        ResultSet resultSet = this.executeQuery(pstm,values);
        //处理结果集
        List<?> result = this.presResultSet(resultSet,rowMapper);

        connection.close();

        pstm.close();

        resultSet.close();

        return result;

    }



    private List<?> presResultSet(ResultSet resultSet, RowMapper rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int i=1;
        while (resultSet.next()){
            result.add(rowMapper.mapRow(resultSet,i++));
        }
        return result;
    }

    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i <values.length ; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception {
        return dataSource.getConnection();
    }
}
