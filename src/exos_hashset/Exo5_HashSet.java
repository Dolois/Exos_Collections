package exos.collections;

import java.util.HashSet;

// Ecrire un programme Java pour tester un HashSet vide ou non.
public class Exo5_HashSet 
{
	public static void main(String[] args) 
	{
		// Creer une instance de la classe HashSet
		HashSet hs1 = new HashSet();
		
		// Ajouter et initialiser des elements dans la HashSet
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(true);
		hs1.add(false);
		hs1.add("A");
		hs1.add("B");
		hs1.add("C");		// chaine de caracteres
		hs1.add('C');		// caractere
		
		if (!hs1.isEmpty())
		{
			System.out.println("HashSet n'est pas vide !!");
			System.out.println(hs1);
		}
		else
		{
			System.out.println("HashSet est vide !!");
			System.out.println(hs1);
		}
	}
}