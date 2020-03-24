package com.Fedex.project.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")

public class FedexEmpModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "employeeid")
	private int employeeid;
	@Column(name = "firstname")
	private String firstname;
	//String a=firstname.toUpperCase();
	@Column(name = "middlename")
	private String middlename;
	//String b=middlename.toUpperCase();
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email")
	private String email;
	@Column(name = "phoneno")
	private String phoneno;
	@Column(name = "gender")
	private String gender;
	@Column(name = "address")
	private String address;
	@Column(name = "state")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name = "zipcode")
	private String zipcode;
	
	//date format-------------------------
	//String Pattern = "YYYYMMDD";
	//SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Pattern);
	//@Column(name = "hireddate")
	//String  hireddate = simpleDateFormat.format(new Date());
	//------------------------------------
	
	//Calculation for annual salary-------
	//@Column(name = "monthlysalary")
	//double monthlysalary;
	//@Column(name = "annualsalary")
	//double annualsalary = monthlysalary * 12;
	//-------------------------------------
	@Column(name = "weeklysalary")
	private double weeklysalary;
	@Column(name = "deleteflag")
	private String deleteflag;

}

