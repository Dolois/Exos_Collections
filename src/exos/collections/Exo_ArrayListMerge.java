package exos.collections;

import java.util.ArrayList;

public class Exo_ArrayListMerge 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		ArrayList al3 = new ArrayList();
		
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add(1);
		al1.add(2);
		al1.add(3);
		System.out.println("ArrayList n° 1 : " + al1);
		
		al2.add("a");
		al2.add("b");
		al2.add("c");
		al2.add(4);
		al2.add(5);
		al2.add(6);
		System.out.println("ArrayList n° 2 : " + al2);
		
		// fusion de deux ArrayList
		al3.addAll(al1);
		al3.addAll(al2);
		
		System.out.println("ArrayList n° 3 : " + al3);
	}
}