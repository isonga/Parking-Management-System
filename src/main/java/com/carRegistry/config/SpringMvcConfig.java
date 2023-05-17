package com.carRegistry.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.carRegistry.Dao.CarDao;
import com.carRegistry.Dao.UserDao;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.carRegistry")
public class SpringMvcConfig  implements WebMvcConfigurer{

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/cardb");
		dataSource.setUsername("root");
		dataSource.setPassword("Musagi@20");
		return dataSource;
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public CarDao getCarDao() {
		return new CarDao(getDataSource());
	}
	@Bean
	public UserDao getUserDao() {
		return new UserDao(getDataSource());
	}
}
