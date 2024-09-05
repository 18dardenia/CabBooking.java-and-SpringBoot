package com.infy.cabbooking.service;

import java.util.List;

import com.infy.cabbooking.dto.BookingDTO;
import com.infy.cabbooking.exception.CabBookingException;

public interface CabBookingService {
	
	public Integer bookCab(BookingDTO bookingDTO) throws CabBookingException;
	public List<BookingDTO>  getDetailsByBookingType(String customerName) throws CabBookingException;
	
	

}
