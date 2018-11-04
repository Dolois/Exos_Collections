package exos.collections;

import java.util.ArrayList;
import java.util.Collections;

// Ecrire un programme Java pour trier une arraylist donnée.
public class Exo_ArrayListSort 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Tigre");
		al.add("Lion");
		al.add("Jaguar");
		al.add("Guépard");
		al.add("Panthère");
		al.add("Puma");
		al.add("Lynx");
		
		// Trier une ArrayList
		Collections.sort(al);
		
		// Afficher une ArrayList
		System.out.println(al);
	}
}