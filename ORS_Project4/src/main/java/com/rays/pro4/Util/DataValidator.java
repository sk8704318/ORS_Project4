package com.rays.pro4.Util;

import java.util.Date;
/**
 * This class validates input data.
 * 
 * @author Sanjay Kumar
 *
 */
public class DataValidator {

	public static boolean isNull(String val){
		if(val==null || val.trim().length()==0) {
			System.out.println(val+"data validator ke value aayi is null main");
			
			return true;
		}else{
			System.out.println(val+"data validtor ke is null ke else me gya");
			return false ;
		}
	}
	public static boolean isNotNull(String val){
		System.out.println(val +"data validator ke is not null me aaya");
		return !isNull(val);
	
	}
	public static boolean isInteger(String val){
		if(isNotNull(val)){
			System.out.println(val +"data validator ke is intger me aaya");
			try{
				int i=Integer.parseInt(val);
				System.out.println(val +"d v parse int se convert");
				return true;
			}catch(NumberFormatException e){
					return false;
			}
		}else{
			return false;
		}
	}
	public static boolean isLong(String val){
		if(isNotNull(val)){
			System.out.println(val +"D V ke is long");
			try{
				long i=Long.parseLong(val);
				System.out.println(val +" D V long parse int");
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}else{
			return false;
		}
	} 
	

	  public static boolean isEmail(String val) {
			System.out.println(val +"d v ke is email me aayi ");
	        String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	    	System.out.println(val +"d v ke email ka pattren match kiya");
	        if (isNotNull(val)) {
	            try {
	            	System.out.println(val +"value .match se dv me email match karaya");
	                return val.matches(emailreg);
	                
	            } catch (NumberFormatException e) {
	                return false;
	            }

	        } else {
	        	System.out.println(val +"dv ke isemail ke else block me gya");
	            return false;
	        }
	    }

	
	public static boolean isDate(String val){
		
		System.out.println(val +"dv ke isdate me gya");
		Date d=null;
		if(isNotNull(val)){
			System.out.println(val +"dv is date if");
			d=DataUtility.getDate(val);
		}
		return d!=null;
	}
	public static boolean isName(String val) {
		System.out.println(val +"dv ke is name me gya");
		String namereg = "^[^-\\s][\\p{L} .'-]+$";
		System.out.println(val +"dv ke isname me pattern match kiya");
		if (isNotNull(val)) {
			System.out.println(val +"condision check ki is name ki");
			try {
				return val.matches(namereg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}
	public static boolean isPassword(String val) {
		System.out.println(val +"dv le ispass me aaya");
		String passreg = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}";
		System.out.println(val +" dv ke is pass ka pattren match kiya");
		if (isNotNull(val)) {
			try {
				System.out.println(val +"dv ke is pass try catch block");
				return val.matches(passreg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}
	public static boolean isPasswordLength(String val) {

		if (isNotNull(val) && val.length() >= 8 && val.length() <= 12) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks if value is valid Phone No.
	 * 
	 * @param val
	 * @return
	 */
	public static boolean isPhoneNo(String val) {

		String phonereg = "^[6-9][0-9]{9}$";

		if (isNotNull(val)) {
			try {
				return val.matches(phonereg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}

	/**
	 * Checks if value of Mobile No is 10
	 * 
	 * @param val
	 * @return
	 */
	public static boolean isPhoneLength(String val) {

		if (isNotNull(val) && val.length() == 10) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Checks if value is Date
	 * 
	 * @param val
	 * @return
	 */
	
	/**
	 * Checks if Date is on Sunday
	 * 
	 * @param val
	 * @return
	 */
	
	public static boolean isRollNo(String val) {

		String rollreg = "[a-zA-Z]{2}[0-9]{3}";

		if (isNotNull(val)) {
			try {
				return val.matches(rollreg);
			} catch (NumberFormatException e) {
				return false;
			}

		} else {
			return false;
		}
	}
	public static boolean isAge(String val){
		System.out.println(val +"is age  me aaye ");
    	Date today = new Date();
    	Date enterDate = DataUtility.getDate(val);
    	System.out.println(val +"kya hua yaha aane se dv ki is age me");
    	int age = today.getYear() - enterDate.getYear();
    	System.out.println(val +"  age me se    "+today.getYear()+-+enterDate.getYear()  );
    	if(age > 18 && isNotNull(val)){
    		System.out.println(val +"condision check ki yadi 18 se kam h ya nahi hai to false ");
    		return true;
    	}else{
    		return false;							
    	}
    }
	 public static boolean isMobileNo(String val){
	    	
	    	String mobreg = "^[6-9][0-9]{9}$";
	    	
	    			if (isNotNull(val) && val.matches(mobreg)) {
						
							return true;
	    				}else
	    				{	
	    					return false;
						}	
	    		}
	 
	
	public static void main(String[] args) {
		System.out.println("Not Null 2"+isNotNull("ABC"));
		System.out.println("Not Null 3"+isNotNull(null));
		System.out.println("Not Null 4"+isNull("123"));
		
		
		System.out.println("is int"+isInteger(null));
		System.out.println("Is int"+isInteger("ABC1"));
		System.out.println("Is Int"+isInteger("123"));
		System.out.println("is Int"+isNotNull("123"));
	}
	
}
