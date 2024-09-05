package com.infy.cabbooking;

import com.infy.cabbooking.repository.BookingRepository;
import com.infy.cabbooking.repository.CabRepository;
import com.infy.cabbooking.service.CabBookingService;
import com.infy.cabbooking.service.CabBookingServiceImpl;


public class CabBookingApplicationTests {

	
	
	private CabRepository cabRepository;
	

	
	private BookingRepository bookingRepository;
	
	
	private CabBookingService cabBookingService = new CabBookingServiceImpl();
	
	
	
	public void bookCabInvalidCabNoTest() {
	
	}
	
	
	public void getDetailsByBookingTypeNoDetailsFound() {

	}
	

}
