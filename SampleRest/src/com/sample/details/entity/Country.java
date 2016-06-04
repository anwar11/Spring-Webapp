package com.sample.details.entity;

import java.io.Serializable;

public class Country  implements Serializable{
private static final long serialVersionUID = 1L;
	
	private String isoa2;
	private String name;
	private String fullName;
	private String isoa3;
	private Integer countryId;
	
	public Country() {
	}

	public Country(String isoa2, String name,Integer countryId) {
		this.isoa2 = isoa2;
		this.name = name;
		this.countryId = countryId;
	}

	public String getIsoa2() {
		return isoa2;
	}

	public void setIsoa2(String isoa2) {
		this.isoa2 = isoa2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIsoa3() {
		return isoa3;
	}

	public void setIsoa3(String isoa3) {
		this.isoa3 = isoa3;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	
	
}
