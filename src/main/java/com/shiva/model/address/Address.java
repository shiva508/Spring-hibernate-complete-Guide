package com.shiva.model.address;

public class Address {
	private Integer addressId;
	private String address;
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
