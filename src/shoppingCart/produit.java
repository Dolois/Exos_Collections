package shoppingCart;

import java.util.Objects;

class Produit 
{
	private Integer pid;
	private String name;
	private Double price;
	private Integer stock;

	// Declarer un constructor
	public Produit() {}

	// Declarer un constructor
	public Produit (Integer pid, String name, Double price, Integer stock) {}
	
	// Declarer les methodes getters et setters
	public String getName() ;
	public void setName(String name);

	public Double getPrice() ;
	public void setPrice(Double price) ;

	public Integer getStock();
	public void setStock(Integer stock);
	
	public Integer getPid();
	public void setPid(Integer pid);
	
	@Override
	public int hashCode() ;
	
	@Override
	public boolean equals(Object obj);
}