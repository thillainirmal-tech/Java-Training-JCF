package com.example.jcf;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<arrayListCreate> gadgetlist = new ArrayList<>();
		gadgetlist.add(new arrayListCreate("smartphone",55000.00));
		gadgetlist.add(new arrayListCreate("laptop",2500.00));
		gadgetlist.add(new arrayListCreate("wear",5000));
		gadgetlist.add(new arrayListCreate("headphone",2000.00));
		System.out.println("List of gadget");
		for(arrayListCreate gadget:gadgetlist) {
			System.out.println(gadget);
		}
		//access element 
		arrayListCreate laptop = gadgetlist.get(3);
		System.out.println(laptop);
		
		
		
		

	}

}
