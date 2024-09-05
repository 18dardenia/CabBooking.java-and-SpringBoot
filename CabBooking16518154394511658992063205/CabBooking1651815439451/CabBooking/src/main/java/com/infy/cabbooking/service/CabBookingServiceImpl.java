package com.infy.cabbooking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.infy.cabbooking.dto.BookingDTO;
import com.infy.cabbooking.entity.Booking;
import com.infy.cabbooking.entity.Cab;
import com.infy.cabbooking.exception.CabBookingException;
import com.infy.cabbooking.repository.BookingRepository;
import com.infy.cabbooking.repository.CabRepository;
import com.infy.cabbooking.validator.BookingValidator;

import jakarta.transaction.Transactional;



@Service(value = "cabBookingService")
@Transactional
public class CabBookingServiceImpl implements CabBookingService {
	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private CabRepository cabRepository;


	@Override
	public List<BookingDTO> getDetailsByBookingType(String bookingType) throws CabBookingException {
		List<Booking> bookings = bookingRepository.findByBookingType(bookingType);
		if(bookings.isEmpty()){
			throw new CabBookingException("Service.NO_DETAILS_FOUND");
		}
		List<BookingDTO> bookingDTOs = new ArrayList<>();
		for (Booking booking : bookings){
			BookingDTO DTO = new BookingDTO();
			DTO.setBookingId(booking.getBookingId());
			DTO.setCustomerName(booking.getCustomerName());
			DTO.setPhoneNo(booking.getPhoneNo());
			DTO.setBookingType(booking.getBookingType());
			bookingDTOs.add(DTO);
		}
		return bookingDTOs;
		}

	
	@Override
	public Integer bookCab(BookingDTO bookingDTO) throws CabBookingException {
		BookingValidator validator = new BookingValidator();
		validator.validate(bookingDTO);

		Cab cab = cabRepository.findById(bookingDTO.getCabDTO().getCabNo())
		.orElseThrow(() -> new CabBookingException("Service.CAB_NOT_AVAILABLE"));
		if(cab.getAvailability().equalsIgnoreCase("No")){
			throw new CabBookingException("Service.CAB_NOT_AVAILABLE");
		}
		Booking booking = new Booking();
		booking.setBookingId(bookingDTO.getBookingId());
		booking.setCustomerName(bookingDTO.getCustomerName());
		booking.setPhoneNo(bookingDTO.getPhoneNo());
		booking.setBookingType(bookingDTO.getBookingType());

		Cab cab1 = new Cab();
		cab1.setCabNo(cab.getCabNo());
		cab1.setModelName(cab.getModelName());
		cab1.setDriverPhoneNo(cab.getDriverPhoneNo());
		cab1.setAvailability("No");
		booking.setCab(cab1);

		bookingRepository.save(booking);
		
		
		return booking.getBookingId();
		}
	
	

}



