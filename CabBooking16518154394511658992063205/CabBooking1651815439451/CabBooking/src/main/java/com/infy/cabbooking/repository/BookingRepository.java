package com.infy.cabbooking.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.cabbooking.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
    List<Booking> findByBookingType(String bookingType);


}
