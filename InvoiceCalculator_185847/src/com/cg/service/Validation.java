package com.cg.service;

public interface Validation {
	String weightpattern="[1-9][0-9]*";
	String distancepattern="[1-9][0-9]";
	
	public static boolean validatedata(String data, String pattern) {
		return data.matches(pattern);
	}

}
