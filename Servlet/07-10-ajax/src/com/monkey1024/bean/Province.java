package com.monkey1024.bean;

import java.util.List;

/**
 * 
 * 省份
 *
 */
public class Province {
	private String name;
	private List<City> cities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
