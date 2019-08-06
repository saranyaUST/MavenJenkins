package service;

import java.time.LocalDate;
import java.time.Period;



public class CitizenService {

	public int computeAge(LocalDate dob){
		int age=0;
		LocalDate today = LocalDate.now();
		
		age = Period.between(dob, today).getYears();
		return age;
		
	
	}
	
	public boolean isEligibleToVote(LocalDate dob ) {
		boolean isEligible=false;
		int age = computeAge(dob);
	
		if(age>=18)
	  isEligible=true;
	 return isEligible;
	}
}
