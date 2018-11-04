package exos.collections;

import java.util.TreeSet;

public class Exo1_TreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("rouge");
		ts.add("bleu");
		ts.add("cuivre");
		ts.add("orange");
		ts.add("marron");
		ts.add("jaune");
		
		// TreeSet tri par d�faut
		System.out.print("TreeSet avant : " );
		for(String e : ts)
		{
			System.out.print(e + " ");
		}
		
		// TreeSet gere les doublons
		ts.add("jaune");
		ts.add("bleu");
		ts.add("violet");
		
		System.out.print("\nTreeSet apr�s : " );
		for(String e : ts)
		{
			System.out.print(e + " ");
		}
	}
}