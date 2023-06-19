package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePagesControllers {

	@RequestMapping("/")
	public String homePage() {
		return "main";
	}
	
	@RequestMapping("/family-package")
	public String familyPackage() {
		return "family-package";
	}
	
	@RequestMapping("/hotels-list")
	public String hotelsList() {
		return "hotels-list";
	}
	
	@RequestMapping("/events")
	public String events() {
		return "events";
	}
	
	@RequestMapping("/booking-all")
	public String bookingAll() {
		return "booking-all";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/booking-tour-package")
	public String bookingTourPackage() {
		return "booking-tour-package";
	}
	
	@RequestMapping("/booking-hotel")
	public String bookingHotel() {
		return "booking-hotel";
	}
}
