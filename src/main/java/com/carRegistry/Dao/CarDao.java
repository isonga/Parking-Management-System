package com.carRegistry.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.carRegistry.model.Car;

public class CarDao implements CarRepository {

	private JdbcTemplate jdbcTemplate;
	
	
	public CarDao(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Car car) {
		String sql="INSERT INTO car(plateNo,floor,vehicleType,avlSlot,bookedSlot) values(?,?,?,?,?)";
		return jdbcTemplate.update(sql, car.getPlateNo(),car.getFloor(),car.getVehicleType(),car.getAvlSlot(),car.getBookedSlot());
	}

	@Override
	public Car get(String plateNo) {
		String sql="SELECT * FROM car WHERE plateNo="+ "'"+plateNo+"'";
		
		ResultSetExtractor<Car> extractor = new  ResultSetExtractor<Car>() {

			@Override
			public Car extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
				String plateNo=rs.getString("plateNo");
				String floor=rs.getString("floor");
				String vehicleType = rs.getString("vehicleType");
				String avlSlot = rs.getString("avlSlot");
				String bookedSlot= rs.getString("bookedSlot");
				
				return new Car(plateNo, floor, vehicleType,avlSlot,bookedSlot);
				}
				return null;
			}
		};
		return jdbcTemplate.query(sql, extractor);
	}

	@Override
	public int delete(String plateNo) {
		String sql="DELETE FROM car WHERE plateNo="+"'"+plateNo+"'";
		return jdbcTemplate.update(sql);
	}

	@Override
	public int update(Car car) {
		String sql ="UPDATE car SET floor=?,vehicleType=?,avlSlot=?, bookedSlot=? where plateNo=?";
		return jdbcTemplate.update(sql, car.getFloor(),car.getVehicleType(),car.getAvlSlot(),car.getBookedSlot(),car.getPlateNo());
	}

	@Override
	public List<Car> list() {
		String sql="SELECT * FROM car";
		RowMapper<Car> rowMapper = new RowMapper<Car>() {

			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
				String plateNo=rs.getString("plateNo");
				String floor=rs.getString("floor");
				String vehicleType=rs.getString("vehicleType");
				String avlSlot=rs.getString("avlSlot");
				String bookedSlot=rs.getString("bookedSlot");
				return new Car(plateNo,floor, vehicleType,avlSlot,bookedSlot);
			}
		};
		return jdbcTemplate.query(sql, rowMapper);
	}

}
