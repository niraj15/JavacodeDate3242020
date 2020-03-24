package com.Fedex.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Fedex.project.model.FedexEmpModel;

public interface FedexEmpRepository extends JpaRepository<FedexEmpModel, String> {

	
	
}

