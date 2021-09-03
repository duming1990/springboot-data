package com.duming;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class SpringbootDataApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        //查看一下默认数据源： hikari
        System.out.println(dataSource.getClass());

        //获得数据库链接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        //xxxTemplate: SpringBoot已经配置好的模板bean，拿来即用 crud

        //关闭
        connection.close();

    }

}
