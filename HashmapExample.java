package com.example.jcf;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> score = new HashMap<>();
		//add key pairs
		score.put("Student1",90);
		score.put("Student2", 85);
		score.put("Student3", 75);
		score.put("Student4", 75);
		System.out.println("Student details are updated");
		for(Map.Entry<String,Integer> entryVal:score.entrySet()) {
		 System.out.println(entryVal.getKey()+":"+entryVal.getValue());
		 

	}
		System.out.println(score.get("Student2"));
		System.out.println(score.get("Student3"));
		System.out.println(score.get("Student1"));

}
}
