package exos.collections;

import java.util.ArrayList;
import java.util.Collections;

// Ecrire un programme Java pour inverser des éléments dans une arraylist.
public class Exo_ArrayListReverse 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("a");
		al.add("b");
		al.add("c");
		al.add(true);
		al.add(false);
		al.add(1);
		al.add(2);
		al.add(3);
		
		System.out.println("ArrayList avant : " + al);
		
		Collections.reverse(al);
		
		System.out.println("ArrayList après : " + al);
	}
}