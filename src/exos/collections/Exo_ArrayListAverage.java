package exos.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo_ArrayListAverage 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int somme = 0;
		int moyenne = 0;
		int nombre = 0;
		
		for (int i = 0; i < 20; i++)
		{
			System.out.println("Saisir un entier : " );
			int entier = sc.nextInt();
			al.add(entier);
			somme = somme + entier;
		}
		moyenne = somme / al.size();
		System.out.println("La moyenne des vingt valeurs est : " + moyenne);
		
		for(int num : al)
		{
			if (num > moyenne)
			{
				nombre++;
				System.out.println("Valeur de l'ArrayList : " + num);
			}
		}
		System.out.println("Nombre d'élément(s) supérieur(s) a la moyenne : " + nombre);
	}
}
