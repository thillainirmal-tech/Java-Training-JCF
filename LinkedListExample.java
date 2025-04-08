package com.example.jcf;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<arrayListCreate> gadgetlist = new LinkedList<>();
		gadgetlist.add(new arrayListCreate("watch",2500.00));
		gadgetlist.add(new arrayListCreate("lablets",35000.00));
		gadgetlist.add(new arrayListCreate("Appliance",45000.00));
		for(arrayListCreate gadget : gadgetlist) {
			System.out.println(gadget);
		}
		arrayListCreate mointor = gadgetlist.get(2);
		System.out.println(mointor);

	}

}
