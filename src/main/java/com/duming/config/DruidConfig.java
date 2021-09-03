package com.duming.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {
    @Bean
    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource druidDataSource(){
        return  new DruidDataSource();
    }

 public ServletRegistrationBean statViewServlet(){
     ServletRegistrationBean<Servlet> bean = new ServletRegistrationBean<>(new StatViewServlet(),"/druid/*");
//     bean.setServlet(new StatViewServlet());
     Map<String, String> initParameters=new HashMap<>();
     initParameters.put("loginUsername","duming");
     bean.setInitParameters(initParameters);
     return bean;
 }


}
