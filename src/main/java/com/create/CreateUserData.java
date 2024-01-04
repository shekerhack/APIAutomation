package com.create;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class CreateUserData {
	
	@Test()
	public void createUser() {
		ArrayList li = new ArrayList(); //ordered
		
		li.add("Rama");
		li.add("Krishna");
		li.add("Sheker");
		li.add("Lakshmi");
		li.add("Sima");
		System.out.println(li);
		li.add ("Sita");
		System.out.println(li);
		System.out.println(li.get(4));		
	}
	
	@Test()
	public void students() {
		
		HashSet sh = new HashSet(); //Set is not allowed duplicates unordered
		
		sh.add("Srudent1");
		sh.add("Srudent2");
		sh.add("Srudent3");
		sh.add("Srudent4");
		sh.add("Srudent5");
		System.out.println(sh);		
	}
	
	@Test()
	public void teachers() {
		
		HashMap hm = new HashMap(); 
		
		hm.put(1, "ID");
		hm.put(2, "Name");
		hm.put(3, "Mobile number");
		hm.put(4, "Salary");
		System.out.println(hm);		
	}

}
