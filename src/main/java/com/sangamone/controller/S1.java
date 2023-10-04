package com.sangamone.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class S1 {

	@GetMapping("/")
	public Map<Character, Integer> convert1() {
	List<Integer>  list1 = new ArrayList<>();
	 for(int i=0; i<26;i++) {
		 list1.add(65+i);
	 }
	 
	 List<Character> list2=new ArrayList<>();
	 
	 for(int i=0; i<26; i++) { 
		 int temp1=list1.get(i);
		 list2.add((char)temp1);
	 }
	 Map<Character, Integer> map = new HashMap<>();
	 map.put(list2.get(0), list1.get(0));
	 
	return map;
}
}
