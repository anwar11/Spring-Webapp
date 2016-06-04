package com.sample.rest;

import java.util.List;

import com.sample.details.entity.Country;



public interface ICountryDao {
	public List<Country> getAllCountries() throws Exception;
	public Country getCountry(String id) throws Exception;
}
