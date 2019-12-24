package com.shiva.model.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ADDRESS_ID")
	private Integer addressId;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="PINCODE")
	private String pinCode;
	@Column(name="CITY")
	private String City;
	@Column(name="LOCATION")
	private String location;
	@OneToOne
	@JoinColumn(name ="ADD_TYPE")
	private AddressType addressType;

	public Address() {

	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", addressType=" + addressType + "]";
	}

}
