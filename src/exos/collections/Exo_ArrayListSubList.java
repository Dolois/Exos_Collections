package exos.collections;

import java.util.ArrayList;

public class Exo_ArrayListSubList 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add("a");
		al1.add("b");
		al1.add("c");
		
		System.out.println("ArrayList n° 1 avant : " + al1);
		
		// Soustraire les elements 1, 2, 3 de l'ArrayList n° 1 dans l'ArrayList n° 2
		al2.addAll(al1.subList(3,6));
		
		System.out.println("ArrayList n° 1 après : " + al1);
		
		System.out.println("ArrayList n° 2 : " + al2);
	}
}