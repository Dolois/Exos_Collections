package exos.collections;

import java.util.ArrayList;

public class Exo_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("Bonjour Dominick"); 
		al.add(4); 
		al.add(12.20f); 
		al.add("Salut Dominick"); 

		for (int i = 0; i < al.size(); i++) 
		{ 
			System.out.println("donnée à l'indice " + i + " = " + al.get(i)); 
		}
	}
}