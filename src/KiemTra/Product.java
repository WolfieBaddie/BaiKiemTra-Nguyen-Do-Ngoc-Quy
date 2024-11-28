package KiemTra;

public class Product {
	int Id;
	String productName;
	String thumbnail;
	double Price;
	int qty;
	String description;
	
	public Product() 
	{
		
	}
	public Product(int Id, String productName, String thumbnail, double Price, int qty, String description)
	{
		this.Id = Id;
		this.productName = productName;
		this.thumbnail = thumbnail;
		this.Price = Price;
		this.qty = qty;
		this.description = description;
	}
	
	public void setId(int Id) 
	{
		this.Id = Id;
	}
	
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	
	public void setPrice(double Price) 
	{
		this.Price = Price;
	}
	
	public void setQty(int qty)
	{
		this.qty = qty;
	}
	
	public void setDescription(String description) 
	{
		this.description = description;
	}
	
	public String getProductName() 
	{
		return this.productName;
	}
	
	public int getId() 
	{
		return this.Id;
	}
	
	public String getThumbnail() 
	{
		return this.thumbnail;
	}
	
	public double getPrice() 
	{
		return this.Price;
	}
	
	public String getDescription() 
	{
		return this.description;
	}
	
	public int getQty() 
	{
		return this.qty;
	}
	
	public boolean checkAvailablity(int qty)
	{
		boolean enough = true;
		if(this.getQty() >= qty) 
		{
			enough = true;
			return enough;
		}
		else 
		{
			enough = false;
			return enough;
		}
	}
	
	public double placeOrder(int qty)
	{
		double totalPrice =  0;
		if(this.checkAvailablity(qty)) 
		{
			int newQty = this.qty - qty;
			this.qty = newQty;
		
			totalPrice = qty * this.getPrice();
		}
		return totalPrice;
	}
	
	public void displayInfo() 
	{
		System.out.println("Product's Id: " + this.getId());
		System.out.println("Product Name: " + this.getProductName());
		System.out.println("Product thumbnail: " + this.getThumbnail());
		System.out.println("Product's description: " + this.getDescription());
		System.out.println("Product's price: " + this.getPrice());
		System.out.println("Product's quantity: " + this.getQty());
	}
	
}

