package exos.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Exo_ArrayListShuffle 
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
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(true);
		al.add(false);
		
		System.out.println("ArrayList avant : " + al);
		
		// Melanger une ArrayList
		Collections.shuffle(al);
		
		System.out.println("ArrayList après : " + al);
	}
}