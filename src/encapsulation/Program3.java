package encapsulation;

import com.encapsulation.one.Pogram1;

public class Program3 extends Pogram1 
{
	public static void main(String[] args) {
		Pogram1 p1 = new Pogram1();
		System.out.println(p1.a);
		System.out.println(p1.b);
		p1.test();
		
		Program3 p2 = new Program3();
		System.out.println(p2.c);
		p2.task();
		
	}
}
