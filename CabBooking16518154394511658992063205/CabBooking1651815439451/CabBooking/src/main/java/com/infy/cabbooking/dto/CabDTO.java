package com.infy.cabbooking.dto;



public class CabDTO {
	
	private Integer cabNo;
	private String modelName;
	private Long driverPhoneNo;
	private String availability;

	public CabDTO() {
		super();
	}
	

	public CabDTO(Integer cabNo, String modelName, Long driverPhoneNo, String availability) {
		super();
		this.cabNo = cabNo;
		this.modelName = modelName;
		this.driverPhoneNo = driverPhoneNo;
		this.availability = availability;
	}


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