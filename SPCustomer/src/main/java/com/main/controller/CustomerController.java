package com.main.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.CustomerDTO;

import com.main.exception.EmptyInputException;


import com.main.service.CustomerService;



@RestController
@RequestMapping("/cust")
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	Log logger = LogFactory.getLog(this.getClass());
	

	
	@PostMapping("/save")
	public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) throws EmptyInputException {
		logger.info("Profile creation request for Customer"+" "+customerDTO);
		return customerService.saveCustomer(customerDTO);
	}
	

	@GetMapping("/getall")
	public List<CustomerDTO> getallcustomer() {
		logger.info("Profile request for Customer");
		return customerService.getallcustomer();
	}
	
	@GetMapping("/getcust/{adharid}")
	public CustomerDTO getspecificCust(@PathVariable ("adharid") String adharid) {
		logger.info("Profile  request for specific Customer");
		return customerService.getspecificCust(adharid);
	}
	
	@PutMapping("/update/{adharid}")
	public CustomerDTO updatespecificCust(@RequestBody CustomerDTO customerDTO,  @PathVariable ("adharid") String adharid ) {
		logger.info("Profile updation request for Customer"+" "+customerDTO);
		return customerService.updatespecificCust(customerDTO,adharid);
	}
	
	@DeleteMapping("/delete/{adharid}")
	public Boolean deleteCust( @PathVariable ("adharid") String adharid)
	{
		logger.info("Profile delete request for Customer"+" "+adharid);
		return customerService.deleteCust(adharid);
		
	}

}
