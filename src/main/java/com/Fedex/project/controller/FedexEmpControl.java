package com.Fedex.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Fedex.project.model.FedexEmpModel;
import com.Fedex.project.service.FedexEmpService;

@RestController
public class FedexEmpControl {
	
	@Autowired
	private FedexEmpService employeeservice;

	@RequestMapping("/niraj")
	 public List<FedexEmpModel> getApi() {
	return employeeservice.getAllEmployee();
	
	 }
	
	@RequestMapping(value = "/niraj/{id}", method = RequestMethod.GET)
	public FedexEmpModel getEmployeeByid(@PathVariable("id") String id) {
	return this.employeeservice.getEmployeebyId(id);
	}
		
	
	//@RequestMapping("/employee")
	//public int test() {
		//return 1;
		// public List<EmployeeModel> getApi() {
		// return employeeservice.getAllEmployee();
	//}
	
	@RequestMapping(method = RequestMethod.POST, value = "/niraj")
	public void addStudent(@RequestBody FedexEmpModel employee) {
			
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/niraj/{id}")
	public void addEmployee(@RequestBody FedexEmpModel employee, @PathVariable String id) {
		employeeservice.updateEmployee(employee, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/niraj/{id}")
	public void deleteEmployeeByid(@PathVariable String id) {
		employeeservice.deleteEmployeebyId(id);
	}

}
