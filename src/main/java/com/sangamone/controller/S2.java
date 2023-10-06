package com.sangamone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class S2 {
	
	@GetMapping("/result")
	public List<String> emi() {
	List <String> list1 = new ArrayList<>();// name
	list1.add("James"); // index 0
	list1.add("Peter");
	list1.add("Susan");
	
	List <Integer> list2 = new ArrayList<>();// principle
	list2.add(10000);//0
	list2.add(8000);
	list2.add(5000);
	
	List <Integer> list3 = new ArrayList<>();// time in year
	list3.add(3);//
	list3.add(2);
	list3.add((int) 1.5);
	
	List <Integer> list4 = new ArrayList<>(); // rate
	
	list4.add(8);
	list4.add(7);
	list4.add(6);
	 
	List <Integer> list5 = new ArrayList<>();// interest
	for(int i=0; i<list2.size(); i++) {
	list5.add(list2.get(i)*list3.get(i)*list4.get(i)/100);
	}
	
	List <Integer> list6 = new ArrayList<>(); // total payable amount
	
	for(int i=0; i<list2.size();i++ ) {
	list6.add(list2.get(i)+ list5.get(i));
	}
	
	List <Integer> list7 = new ArrayList<>();// emi per month
	for(int i=0; i<list2.size();i++ ) {
		
	list7.add(list6.get(i)/(list3.get(i)*12));
//	System.out.println(list6.get(0));
//	System.out.println(list3.get(i)*12);

	
	}
	//Dear list1.get(0)
	//Congratulations on taking a loan of $Principal from Silicon Valley Bank. You requested to pay an EMI of $EMI for the next $Months
	List<String> list8 = new ArrayList<>();
	for(int i=0;i<list2.size();i++) {
	list8.add("Dear " + list1.get(i));
	list8.add(" Congratulations on taking a loan of " + list2.get(i) + " " +
	        "from Silicon Valley Bank. You requested to pay an EMI of " + list7.get(i) + " for the next "+list3.get(i)*12+" month");
	}
	return list8;

	
	}
}
