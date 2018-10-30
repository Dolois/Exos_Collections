package exos.collections;

import java.util.ArrayList;

public class Exo_ArrayListCopy 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		
		ArrayList al2 = new ArrayList();
		
		al1.add("Tigre");
		al1.add(15000f);
		al1.add("Bonjour");
		al1.add(12);
		
		// copie tout le contenu de l'ArrayList al1 dans l'ArrayList al2
		al2.addAll(al1);
		
		// for (int i = 0; i < al1.size(); i++) 
		// { 
		// 	al2.add(al1.get(i)); 
		// }
	}
}