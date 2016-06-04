package com.sample.rest;

import java.util.List;

import com.sample.details.entity.Country;

public class CountryDao implements ICountryDao {

	@Override
	public List<Country> getAllCountries() throws Exception {
		// TODO Auto-generated method stub
		String query = "SELECT c.isoa2, c.name, c.full_name, c.isoa3, c.country_id, "
		+ " cn.code AS continentCode, cn.name AS continentName, c.latitude, c.longitude, "
		+ " c.max_latitude, c.min_latitude, c.max_longitude, c.min_longitude  "
		+ " FROM country c, continent cn "
		+ " WHERE c.continent_code = cn.code ORDER BY c.name";
		return null;
	}

	@Override
	public Country getCountry(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
