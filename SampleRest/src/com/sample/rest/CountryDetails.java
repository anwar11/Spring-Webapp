package com.sample.rest;

import java.io.Serializable;



public class CountryDetails implements Serializable {
	private String code;
	private String name;
	
	public CountryDetails(){
		super();
	}
	
	
	public CountryDetails(com.sample.details.entity.Country countryCode){
		this.code = countryCode.getIsoa2();
		this.name = countryCode.getName();

	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "CountryDetails [code=" + code + ", name=" + name + "]";
	}
	

}
