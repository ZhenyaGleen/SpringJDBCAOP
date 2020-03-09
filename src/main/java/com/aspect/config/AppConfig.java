package com.aspect.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.aspect")
public class AppConfig {


//mysql://bb10fd625974a3:39d66a0f@eu-cdbr-west-02.cleardb.net/heroku_61a3faf3ed13b3e?reconnect=true
	private final String URL = "jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_61a3faf3ed13b3e?reconnect=true";
	private final String USER = "bb10fd625974a3";
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String PASSWORD = "39d66a0f";

	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(URL);
		driverManagerDataSource.setUsername(USER);
		driverManagerDataSource.setPassword(PASSWORD);
		driverManagerDataSource.setDriverClassName(DRIVER);
		return driverManagerDataSource;
	}
}
