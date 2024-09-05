package com.infy.cabbooking.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;
	private String customerName;
	private Long phoneNo;
	private String bookingType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cab_no")
	private Cab cab;
	

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
	public Cab getCab() {
		return cab;
	}
	public void setCab(Cab cab) {
		this.cab = cab;
	}
	
}