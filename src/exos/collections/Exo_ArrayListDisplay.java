package exos.collections;

import java.util.ArrayList;

public class Exo_ArrayListDisplay 
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
		
		for (int i = 0; i < al.size(); i++)
		{
			System.out.println("Element n� " + i + " est �gal � " + al.get(i));
		}
	}
}