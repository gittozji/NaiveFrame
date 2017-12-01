package me.imyu.temp;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by imyu on 2017-12-01.
 */
public class MysqlTest {
    @Test
    public void test() throws Exception{
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/hs_base?useUnicode=true&characterEncoding=utf-8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=CST";
        String username = "root";
        String password = "Aaimyu03";

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("select * from user");
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
        rs.close();
        preparedStatement.close();
        connection.close();
    }
}
