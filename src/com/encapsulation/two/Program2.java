package com.encapsulation.two;

//setter method have the input argument and getter method is not have input arguments
// return type of setter method is void and the return type of the getter method is data type 

 class MilitaryOperation {
	private String name;
	private float cordinates;
	private int team;
	 public MilitaryOperation(String name, float cordinates, int team)
	 {
		 this.name = name;
		 this.cordinates = cordinates;
		 this.team = team;
	 }
	 
	 public String getName()
	 {
		 System.out.println("getNmae...");
		 return name;
	 }
	 
	 public float getCordinates()
	 {
		 System.out.println("getNmae...");
		 return cordinates;
	 }
	 
	 public int getTeam()
	 {
		 System.out.println("getNmae...");
		 return team;
	 }
	 
	 public void setName(String name)
	 {
		 System.out.println("get name");
		 this.name = name;
		 System.out.println("updates...");
	 }
	 
	 public void setCordinates(float cordinates)
	 {
		 System.out.println("get cordinates");
		 this.cordinates= cordinates;
		 System.out.println("updates...");
	 }
	 
	 public void setTeam(int team)
	 {
		 System.out.println("get team");
		 this.team= team;
		 System.out.println("updates...");
	 }


}
 
public class Program2
{
	public static void main(String[] args) {
		MilitaryOperation m = new MilitaryOperation("xzy", 4.5f, 4);
		String n = m.getName();
		System.out.println("name = " +n);
		float c = m.getCordinates();
		System.out.println("cordinates = " +c);
		int t = m.getTeam();
		System.out.println("team = " +t);
		
		m.setName("abc");
		String n2 = m.getName();
		System.out.println(n2);
		
		m.setCordinates(5.8f);
		float c2 = m.getCordinates();
		System.out.println(c2);
		
		m.setTeam(23);
		int t2 = m.getTeam();
		System.out.println(t2);
	}
}
