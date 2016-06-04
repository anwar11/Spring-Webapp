package com.sample.rest;

import java.util.List;

public interface IMasterService {

	public List<CountryDetails> getAllCountries() throws Exception;
	public CountryDetails getCountry(String countryCode) throws Exception;
}
