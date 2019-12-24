package com.shiva.dao;

import java.util.List;

import com.shiva.model.address.AddressType;

public interface AddressTypeRepository {
	public AddressType createAddressType(AddressType addressType);
	public AddressType updateAddressType(AddressType addressType);
	public AddressType deleteAddressType(Integer addressTypeId);
	public List<AddressType> AllAddressType();
	public AddressType AddressTypeById(Integer addressTypeId);
}