package exos.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Exo_ArrayListColor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Saisir une couleur ou fini pour arreter le programme : ");
		String color;
		
		// les priorit�s de la condition de sortie du while
		// 1 = saisie d'un string couleur recuperee du scanner
		// 2 = test si la condition de sortie est atteinte
		//     [         1           ] [          2           ]
		while ((color = sc.nextLine()).equals("fini") == false)
		{	
			al.add(color);
		}
		
		for(String element : al)
		{
			System.out.println(element);
		}
	}
}