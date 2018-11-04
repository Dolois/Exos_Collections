package exos.collections;

import java.awt.List;
import java.util.LinkedList;


public class Exo_Test1LinkedList 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe List
		LinkedList lst = new LinkedList();

		lst.add(12);
		lst.add("Bonjour Dominick !!");
		lst.add(12.20f);
		
		for (int i = 0; i < lst.size(); i++)
		{
			System.out.println("élément à l'index " + i + " = " + lst.get(i));
		}
	}
}