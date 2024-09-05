package com.infy.cabbooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cab {
	@Id
	private Integer cabNo;
	private String modelName;
	private Long driverPhoneNo;
	private String availability;
	
	
	public Integer getCabNo() {
		return cabNo;
	}
	public void setCabNo(Integer cabNo) {
		this.cabNo = cabNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Long getDriverPhoneNo() {
		return driverPhoneNo;
	}
	public void setDriverPhoneNo(Long driverPhoneNo) {
		this.driverPhoneNo = driverPhoneNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
}