package com.Fedex.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Fedex.project.model.FedexEmpModel;
import com.Fedex.project.repo.FedexEmpRepository;

@Component
public class FedexEmpService {

	@Autowired

	private FedexEmpRepository employeeRepository;

	public List<FedexEmpModel> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public FedexEmpModel getEmployeebyId(String id) {
		return employeeRepository.getOne(id);
				
	}

	public void addEmployee(FedexEmpModel employee) {
		employeeRepository.save(employee);

	}

	public void updateEmployee(FedexEmpModel employee1, String id) {

		employeeRepository.save(employee1);
	}

	public void deleteEmployeebyId(String id) {

		employeeRepository.deleteById(id);

	}
}
