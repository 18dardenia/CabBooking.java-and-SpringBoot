package com.infy.cabbooking.validator;

import com.infy.cabbooking.dto.BookingDTO;
import com.infy.cabbooking.exception.CabBookingException;

public class BookingValidator
{

    public void validate(BookingDTO bookingDTO) throws CabBookingException
    {
	if (Boolean.FALSE.equals(validatePhoneNo(bookingDTO.getPhoneNo())))
	    throw new CabBookingException("Validator.INVALID_PHONENO");

    }

    public Boolean validatePhoneNo(Long phoneNo)
    {

	return phoneNo.toString().matches("[6-9]{1}[0-9]{9}");

    }

}
