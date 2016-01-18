package com.core.java.dateformat;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		DateFormat format = new SimpleDateFormat();
		Date convertedDate = null;
		
		
		String ddMMyyyy = "22082013";
		format = new SimpleDateFormat(ddMMyyyy);
		convertedDate = (Date)format.parse(ddMMyyyy);
		System.out.println("Date from ddMMyyyy String in Java : " + convertedDate);
		
		
		String yyyyMMdd = "20130822";
		format = new SimpleDateFormat(yyyyMMdd);
		convertedDate = (Date)format.parse(yyyyMMdd);
		System.out.println("Date from yyyyMMdd String in Java : " + convertedDate);
		
		String dd_MM_yyyy = "22-08-2013";
		format = new SimpleDateFormat(dd_MM_yyyy);
		convertedDate = (Date)format.parse(dd_MM_yyyy);
		System.out.println("Date from dd-MM-yyyy String in Java : " + convertedDate);
		
		String byslath = "22/08/2013";
		format = new SimpleDateFormat(byslath);
		convertedDate = (Date)format.parse(byslath);
		System.out.println("Date from dd/MM/yyyy String in Java : " + convertedDate);
		
		String bydot = "22.08.2013";
		format = new SimpleDateFormat(bydot);
		convertedDate = (Date)format.parse(bydot);
		System.out.println("Date from dd.MM.yyyy String in Java : " + convertedDate);
		
		String date$time = "22-08-2013:10:18:55";
		format = new SimpleDateFormat(date$time);
		convertedDate = (Date)format.parse(date$time);
		System.out.println("Date from date$time String in Java : " + convertedDate);
		

	}

}
