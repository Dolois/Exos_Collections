package exos.collections;

import java.util.ArrayList;

// Ecrire un programme Java pour vider une arraylist.
public class Exo_ArrayListClear 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add("A");
		al.add("B");
		al.add("C");
		al.add(true);
		al.add(false);
		
		System.out.println("ArrayList avant : " + al);
		
		// Vider une ArrayList 
		al.clear();
		
		System.out.println("ArrayList après : " + al);
	}
}