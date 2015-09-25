package com.my.practice.sets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AllAboutDates {
	String[] arrDate = {"dd/MM/yyyy", "yyyy/MM/dd", "dd/MM/yy", "MM/dd/yyyy","dd-MM-yy", "yy-MM-dd", "yyyy-MM-dd", "yyyy.MM.dd", "dd.mm.yy", "dd.MM.yyyy"};
	private static final String ddmmyyyyRegex1 = "^(3[01]|2[0-9]|1[0-9]|0[1-9])[/](0?[1-9]|1?[12])[/](\\d{4}|\\d{2})$";//"^(0?[1-9]|[12][1-9]|3[01])[/](0?[1-9]|1?[12])[/](\\d{4}|\\d{2})$";//"^(0?[1-9]|[12][1-9]|3[01])[/](0?[1-9]|1?[12])[/](\\d{4}|\\d{2})$"; //|[A-Z][a-z]{2}
	private static final String ddmmyyyyRegex2 = "^(3[01]|2[0-9]|1[0-9]|0[1-9])[-](0?[1-9]|1?[12])[-](\\d{4}|\\d{2})$";//"^(0?[1-9]|[12][1-9]|3[01])[-](0?[1-9]|1?[12])[-](\\d{4}|\\d{2})$"; //|[A-Z][a-z]{2}
	private static final String ddmmyyyyRegex3 = "^(3[01]|2[0-9]|1[0-9]|0[1-9])[.](0?[1-9]|1?[12])[.](\\d{4}|\\d{2})$";//"^(0?[1-9]|[12][1-9]|3[01])[.](0?[1-9]|1?[12])[.](\\d{4}|\\d{2})$";
	
	private static final String ddmmyyyyRegex7 = "^(01 02 03 04 05 06 07 08 09 10 11 12)[/](0?[1-9]|[12][1-9]|3[01])[/](\\d{4}|\\d{2})$";//"^(1[0-2]|0[1-9])[/](0?[1-9]|[12][1-9]|3[01])[/](\\d{4}|\\d{2})$";//"^(01 02 03 04 05 06 07 08 09]|10 11 12)[/](0?[1-9]|[12][1-9]|3[01])[/](\\d{4}|\\d{2})$";//mm/dd/yyyy
	

	public static void main(String args[]) throws ParseException{
		String d = "31/08/2015", d1 = "09-08-2015",d3="09.05.2015",d4="09/May/2015", d5="11/31/2015";
		/*System.out.println(d.replaceAll(ddmmyyyyRegex1, "dd/mm/yyyy"));
		System.out.println(d.replaceAll(ddmmyyyyRegex2, "dd-mm-yyyy"));*/
		System.out.println(getDatePattern(d5, ""));
	}
	
	
	public static String replacePattern(String datePattern, String fromConfig){
		return fromConfig;
	}
	
	public static boolean checkPatternOfDate(String dateStr, String regex) {
		Matcher m = Pattern.compile(regex).matcher(dateStr);
		return m.matches();
	}
	 
	/*public static String getPatternOfDate(String dateStr, String regex) {
		Matcher m = Pattern.compile(regex).matcher(dateStr);
		//System.out.println(m.group());
		if(m.matches()){
			return "dd/mm/yyyy";
		}else if{
			return  patternFromConfig;
		}return null;
	}
	*/
	
	private static String getDatePattern(String dateFromModel , String patternFromConfig) {
    	if(dateFromModel.matches(ddmmyyyyRegex1)){
    		if(dateFromModel.matches(ddmmyyyyRegex7)){
               return dateFromModel.replaceAll(ddmmyyyyRegex7, "mm/dd/yyyy");
    		}
    		return dateFromModel.replaceAll(ddmmyyyyRegex1, "dd/mm/yyyy");
    	} else if(dateFromModel.matches(ddmmyyyyRegex2)) {
    		return dateFromModel.replaceAll(ddmmyyyyRegex2,"dd-mm-yyyy");
    	}else if(dateFromModel.matches(ddmmyyyyRegex3)){
    		return dateFromModel.replaceAll(ddmmyyyyRegex3,"dd.mm.yyyy");
    	}/*else if(dateFromModel.matches(ddmmyyyyRegex7)) {
    	    return dateFromModel.replaceAll(ddmmyyyyRegex7, "MM/dd/yyyy");
	    }*/else{
    		return patternFromConfig;
    	}
    }
}
