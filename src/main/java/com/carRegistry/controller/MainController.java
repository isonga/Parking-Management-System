package com.carRegistry.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.security.KeyStoreUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.carRegistry.Dao.CarDao;
import com.carRegistry.Dao.UserDao;
import com.carRegistry.model.Car;
import com.carRegistry.model.User;

@Controller
public class MainController {

	@Autowired
	private CarDao carDao;
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/")
	public ModelAndView login(ModelAndView model) {
		
		User user = new User();
		
		model.addObject("user", user);
		model.setViewName("login");
		return model;
	}
	@RequestMapping("/signup")
	public ModelAndView signup(ModelAndView model) {
		
		User user = new User();
		model.addObject("user", user);
		model.setViewName("signup");
		return model;
	}
	@RequestMapping("/home")
	public ModelAndView listCar(ModelAndView model) {
		List<Car> ls = carDao.list();
		
		model.addObject("listCar", ls);
		model.setViewName("list");
		return model;
	}
	@RequestMapping(value="/edit",method = RequestMethod.GET)
	public ModelAndView editCar(@RequestParam String id) {
		Car car = carDao.get(id);
		
		ModelAndView model = new ModelAndView("edit_car");
	    model.addObject("car", car);
	     return model;
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute Car car) {
		if(carDao.get(car.getPlateNo())==null){
			carDao.save(car);
		}else {
			carDao.update(car);
		}
		
		return new ModelAndView("redirect:/home");
	}
	@RequestMapping(value = "/login_user",method = RequestMethod.POST)
	public ModelAndView loginUser(@ModelAttribute User user) {
		
		if(user.getUsername().equals("isaac") && user.getPassword().equals("23124")){
			return new ModelAndView("redirect:/new");
		}else {
		
		return new ModelAndView("redirect:/");
		}
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@RequestParam String id) {
		
		carDao.delete(id);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping("/new")
	public ModelAndView home(ModelAndView model) {
		
		Car car= new Car();
		model.addObject("car", car);
		model.setViewName("home");
		return model;
	}
	
	
	
}
