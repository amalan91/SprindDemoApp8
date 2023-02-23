package com.luv2code.springdemo.model;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	private String firstName;
	@NotNull(message="is required")
	@Size(min=3,message="atleast 3 characters")
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countriesList;
	private String favoriteCourse;
	private String[] knowLanguages;
	@NotNull(message="is required")
	@Min(value=0, message="Must be greater than zero")
	@Max(value=10, message="Must be less than Ten")
	private Integer freePasses;
	
	public Student() {
		countriesList = new LinkedHashMap<String, String>();
		countriesList.put("BR", "BRAZIL");
		countriesList.put("FR", "FRANCE");
		countriesList.put("GE", "GERMANY");
		countriesList.put("IN", "INDIA");
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteCourse() {
		return favoriteCourse;
	}

	public void setFavoriteCourse(String favoriteCourse) {
		this.favoriteCourse = favoriteCourse;
	}

	public String[] getKnowLanguages() {
		return knowLanguages;
	}

	public void setKnowLanguages(String[] knowLanguages) {
		this.knowLanguages = knowLanguages;
	}

	public LinkedHashMap<String, String> getCountriesList() {
		return countriesList;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	
	

	
}
