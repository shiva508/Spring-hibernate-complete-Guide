package com.shiva.controller;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.model.address.Address;

@RestController
public class AddressController {
	@PostMapping(value = "/createAddress", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Address createAddress(@RequestBody Address address) {
		return null;
	}

	@PutMapping(value = "/updateAddress", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Address updateAddress(@RequestBody Address address) {
		return null;
	}

	@DeleteMapping(value = "/deleteAddress/{addressId}")
	public Address deleteAddress(@PathVariable("addressId") Integer addressId) {
		return null;
	}

	@GetMapping(value = "/addresslist", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Address> AllAddress() {
		return null;
	}

	@GetMapping(value = "/addressById/{addressId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Address AddressById(@PathVariable("addressId") Integer addressId) {
		return null;
	}

}
