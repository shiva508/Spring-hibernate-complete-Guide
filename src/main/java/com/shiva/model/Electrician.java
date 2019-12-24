package com.shiva.model;

public class Electrician {
private Integer technicianId;
private String electricianFirstName;
private String electricianLastName;
public Electrician() {
	
}
public Integer getTechnicianId() {
	return technicianId;
}
public void setTechnicianId(Integer technicianId) {
	this.technicianId = technicianId;
}
public String getElectricianFirstName() {
	return electricianFirstName;
}
public void setElectricianFirstName(String electricianFirstName) {
	this.electricianFirstName = electricianFirstName;
}
public String getElectricianLastName() {
	return electricianLastName;
}
public void setElectricianLastName(String electricianLastName) {
	this.electricianLastName = electricianLastName;
}
@Override
public String toString() {
	return "Electrician [technicianId=" + technicianId + ", electricianFirstName=" + electricianFirstName
			+ ", electricianLastName=" + electricianLastName + "]";
}

}
