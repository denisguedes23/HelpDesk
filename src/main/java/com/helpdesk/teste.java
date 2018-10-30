package com.helpdesk;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class teste {
	
	public static void main(String[] args) {
		Date date = new Date();
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_YEAR, 1);
		
		System.out.println(c.getTime());
	}

}
