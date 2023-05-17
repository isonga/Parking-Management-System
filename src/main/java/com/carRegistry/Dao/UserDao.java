package com.carRegistry.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.carRegistry.model.User;


public class UserDao implements UserRepository {

private JdbcTemplate jdbcTemplate;
	
	
	public UserDao(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(User user) {
		String sql="INSERT INTO user (username,email,password) values(?,?,?)";
		return jdbcTemplate.update(sql, user.getUsername(),user.getEmail(),user.getPassword());
	}

	@Override
	public User get(String email) {
		String sql="SELECT * FROM user WHERE email="+ "'"+email+"'";
		
		ResultSetExtractor<User> extractor = new  ResultSetExtractor<User>() {

			@Override
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
				String username=rs.getString("username");
				String email=rs.getString("email");
				String password = rs.getString("password");
				return new User(username, email, password);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}
}
