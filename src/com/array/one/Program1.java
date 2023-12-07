package com.array.one;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ratings; // declaration of an array
		ratings = new int[5]; //creation of array Object
		
		// initialization of array elements
		ratings[2] = 45;
		ratings[0] = 84;
		ratings[1] = 65;
		ratings[3] = 54;
		
		System.out.println(ratings[0]); //utilization of array elements
		System.out.println(ratings[1]);
		System.out.println(ratings[2]);
		System.out.println(ratings[3]);
		
		System.out.println(ratings[6]); //we get runtime exception ==> if arrayindex out of bounds
		
		System.out.println(ratings.length);
		for(int i = 0; i< ratings.length; i++) // we have length variable in array to which has size of array.
		{
			System.out.println(i);
		}
		
	}

}
