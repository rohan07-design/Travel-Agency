package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AllPagesControllers {

	@RequestMapping("/")
	public String HomePage() {
		return "main";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/family-package")
	public String familyPackage() {
		return "family-package";
	}
	
	@RequestMapping("/honeymoon-package")
	public String honeymoonPackage() {
		return "honeymoon-package";
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
	
	@RequestMapping("/booking-car-rentals")
	public String bookingCarRentals() {
		return "booking-car-rentals";
	}
	
	@RequestMapping("/booking-flight")
	public String bookingFlight() {
		return "booking-flight";
	}
	
	@RequestMapping("/booking-slider")
	public String bookingSlider() {
		return "booking-slider";
	}
	
	@RequestMapping("/404")
	public String error404() {
		return "404";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/all-package")
	public String allPackage() {
		return "all-package";
	}
	
	@RequestMapping("/blog")
	public String blog() {
		return "blog";
	}
	
	@RequestMapping("/blog-inner")
	public String blogInner() {
		return "blog-inner";
	}
	
	@RequestMapping("/booking")
	public String booking() {
		return "booking";
	}
	
	@RequestMapping("/custom-package")
	public String customPackage() {
		return "custom-package";
	}
	
	@RequestMapping("/db-all-payment")
	public String dbAllPayment() {
		return "db-all-payment";
	}
	
	@RequestMapping("/db-event-booking")
	public String dbEventBooking() {
		return "db-event-booking";
	}
	
	@RequestMapping("/db-event-details")
	public String dbEventDetails() {
		return "db-event-details";
	}
	
	@RequestMapping("/db-event-hotel-details")
	public String dbEventHotelDetails() {
		return "db-event-hotel-details";
	}
	
	@RequestMapping("/db-hotel-booking")
	public String dbHotelBooking() {
		return "db-hotel-booking";
	}
	
	@RequestMapping("/db-hotel-details")
	public String dbHotelDetails() {
		return "db-hotel-details";
	}
	
	@RequestMapping("/db-my-profile")
	public String dbMyProfile() {
		return "db-my-profile";
	}
	
	@RequestMapping("/db-my-profile-edit")
	public String dbMyProfileEdit() {
		return "db-my-profile-edit";
	}
	
	@RequestMapping("/db-payment")
	public String dbPayment() {
		return "db-payment";
	}
	
	@RequestMapping("/db-refund")
	public String dbRefund() {
		return "db-refund";
	}
	
	@RequestMapping("/db-travel-booking")
	public String dbTravelBooking() {
		return "db-travel-booking";
	}
	
	@RequestMapping("/db-travel-details")
	public String dbTravelDetails() {
		return "db-travel-details";
	}
	
	@RequestMapping("/db-travel-hotel-details")
	public String dbTravelHotelDetails() {
		return "db-travel-hotel-details";
	}
	
	@RequestMapping("/discount")
	public String discount() {
		return "discount";
	}
	
	@RequestMapping("/faq")
	public String faq() {
		return "faq";
	}
	
	@RequestMapping("/forgot-pass")
	public String forgotPass() {
		return "forgot-pass";
	}
	
	@RequestMapping("/group-package")
	public String groupPackage() {
		return "group-package";
	}
	
	@RequestMapping("/hotel-details")
	public String hotelDetails() {
		return "hotel-details";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/places")
	public String places() {
		return "places";
	}
	
	@RequestMapping("/places-1")
	public String places_1() {
		return "places-1";
	}
	
	@RequestMapping("/places-2")
	public String places_2() {
		return "places-2";
	}
	
	@RequestMapping("/places-3")
	public String places_3() {
		return "places-3";
	}
	
	@RequestMapping("/price-list")
	public String priceList() {
		return "price-list";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/regular-package")
	public String regularPackage() {
		return "regular-package";
	}
	
	@RequestMapping("/sitemap")
	public String sitemap() {
		return "sitemap";
	}
	
	@RequestMapping("/testimonials")
	public String testimonials() {
		return "testimonials";
	}
	
	@RequestMapping("/tips")
	public String tips() {
		return "tips";
	}
	
	@RequestMapping("/tour-details")
	public String tourDetails() {
		return "tour-details";
	}
	
	@RequestMapping("/weekend-package")
	public String weekendPackage() {
		return "weekend-package";
	}
}
