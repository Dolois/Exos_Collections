package shoppingCart;

import java.util.ArrayList;
import java.util.List;

class Cart 
{
	List<Produit> cartItems = new ArrayList<Produit>();
	
	public void addProductToCartByPID(int pid);

	private Produit getProductByProductID(int pid);

	private void addToCart(Produit product);

	public void removeProductByPID(int pid);

	void printCartItems();
}