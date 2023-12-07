package com.wrapper;

import java.util.ArrayList;

public class Program_Wrappwe_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(5); // autoBoxing and autoupcasting
		al.add(4.5f); // autoBoxing and autoupcasting
		al.add(true); // autoBoxing and autoupcasting
		al.add('e'); // autoBoxing and autoupcasting
		al.add(654654L); //autoBoxing and autoupcasting
		
		for(Object ob : al)
		{
			System.out.println(ob.toString());
		}
		
	}

}
