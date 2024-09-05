package com.infy.cabbooking.dto;

public class BookingDTO {
	
	private Integer bookingId;
	private String customerName;
	private Long phoneNo;
	private String bookingType;
	private CabDTO cabDTO;
	
	
	public BookingDTO() {
		super();
	}
	
	public BookingDTO(Integer bookingId, String customerName, Long phoneNo, String bookingType, CabDTO cabDTO) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.bookingType = bookingType;
		this.cabDTO = cabDTO;
	}


	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getBookingType() {
		return bookingType;
	}
	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}
	
	public CabDTO getCabDTO() {
		return cabDTO;
	}
	public void setCabDTO(CabDTO cabDTO) {
		this.cabDTO = cabDTO;
	}

}