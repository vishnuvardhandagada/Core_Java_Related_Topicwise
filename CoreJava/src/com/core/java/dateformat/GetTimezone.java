package com.core.java.dateformat;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class GetTimezone {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat gmtTimeFormat = new SimpleDateFormat("yyyy - MM - dd : HH : mm : ss");
		System.out.println("Current system Time And Date is : "+gmtTimeFormat.format(new Date()));
		
		gmtTimeFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		/*Date date = (Date)gmtTimeFormat.parse("yyyy - MM - dd : HH : mm : ss");
		
		System.out.println(date);*/
		
		System.out.println("current Date and Time in GMT time zone:  : "+gmtTimeFormat.format(new Date()));
		

	}

}
