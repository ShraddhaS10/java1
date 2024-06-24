package com.gv.collections.heterogeneous;


import java.util.ArrayList;
import java.util.List;

import com.gv.collections.entities.Employee;

public class HeterogeneousExamples {
public static void main(String[] args) {
	List list = new ArrayList<>(5);
	
	list.add(10);
	list.add("ABC");
	
	list.add(new Employee(1,"EMP1"));
	
	System.out.println(list);
	
	
	int[] intArrays= {1,2,3};
	int length = intArrays.length; 
	
	
}
}
