package com.cyberstreets.cyberstreets.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cyberstreets.cyberstreets.model.Driver;

@RestController
public class DriverController {
	private List<Driver> drivers = createList();

	@RequestMapping(value = "/drivers", method = RequestMethod.GET, produces = "application/json")
	public List<Driver> firstPage() {
		return drivers;
	}

	@RequestMapping(value = "/drivers", method = RequestMethod.POST)
	public Driver create(@RequestBody Driver user) {
		drivers.add(user);
		System.out.println(user);
		return user;
	}
	
	private static List<Driver> createList() {
		List<Driver> tempDrivers = new ArrayList<>();
		return tempDrivers;
	}

}
