package exos.collections;

import java.util.ArrayList;
import java.util.Scanner;

// Ecrire un programme java qui permet de stocker dans une ArrayList
// vingt entiers saisis au clavier par l'utilisateur.
// Afficher tous les entiers saisis supérieurs a la moyenne calculée.
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
		
		// Effectuer une iteration for_each de tous les elements de l'ArrayList al
		// pour afficher tous les entiers saisis superieurs a la moyenne calculee
		for(int num : al)
		{
			if (num > moyenne)
			{
				nombre++;
				System.out.println("Valeur de l'ArrayList superieur à la moyenne : " + moyenne + " est " + num);
			}
		}
		System.out.println("Nombre d'élément(s) supérieur(s) a la moyenne : " + nombre);
	}
}