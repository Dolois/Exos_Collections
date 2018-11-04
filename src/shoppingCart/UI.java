package shoppingCart;

import java.util.List;
import java.util.Scanner;

public class UI 
{
	Cart cart = new Cart();

	private int ch = 0;

	public UI () 
	{
		menu();
	}

	// Afficher le menu de gestion des produits du magasin
	public void startScreen () 
	{
		System.out.println("1. Afficher les Produits en Magasin");
		System.out.println("2. Afficher Panier");
		System.out.println("0. Sortie");
	}
	
	// Afficher le menu de gestion du panier
	public void storeProductsMenu() 
	{
		System.out.println("1. Ajouter au Panier");
		System.out.println("2. Supprimer du Panier");
		System.out.println("0. Sortie");
	}

	public void menu();

	private int getUserInput() throws NumberFormatException;

	// Afficher les produits du magasin
	private void displayStoreProducts();

	// Ajouter un produit au panier
	private void addProductToCart();

	// Afficher le contenu du panier
	private void showCart();

	// Supprimer un produit du panier
	private void removeProductFromCart();
}