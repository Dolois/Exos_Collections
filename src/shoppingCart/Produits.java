package shoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Produits 
{
	private final List<Produit> products = new ArrayList<Produit>();
	
	public Produits() 
	{ 
		this.initStoreItems();
	};

	public List<Produit> getProducts();

	public void initStoreItems();
}