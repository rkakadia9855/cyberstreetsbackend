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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyberstreets.cyberstreets.model.Rider;

@RestController
public class RiderController {
	private List<Rider> riders = createList();

	@RequestMapping(value = "/riders", method = RequestMethod.GET, produces = "application/json")
	public Rider firstPage(@RequestParam("email") String email,
            @RequestParam("password") String password) {
		for(int i = 0; i < riders.size(); i++) {
			if(riders.get(i).getEmail().equals(email)
					&& riders.get(i).getPassword().equals(password))
				return riders.get(i);
		}
		return null; 
	}

	@RequestMapping(value = "/riders", method = RequestMethod.POST)
	public Rider create(@RequestBody Rider user) {
		riders.add(user);
		System.out.println(user);
		return user;
	}
	
	private static List<Rider> createList() {
		List<Rider> tempRiders = new ArrayList<>();
		Rider rider1 = new Rider("User", "One", "userone@gmail.com", "pass", 123);
		Rider rider2 = new Rider("User", "Two", "usertwo@gmail.com", "pass", 456);

		tempRiders.add(rider1);
		tempRiders.add(rider2);
		
		return tempRiders;
	}

}
