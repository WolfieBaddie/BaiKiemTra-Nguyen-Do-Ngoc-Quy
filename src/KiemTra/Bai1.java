package KiemTra;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);

		
			System.out.println("Enter Product's Id: ");
			int id = scn.nextInt();
			System.out.println("Enter Product's Name: ");
			String productName = scn.nextLine();
			scn.nextLine();
			System.out.println("Enter Product's thubmnail: ");
			String thumbnail = scn.nextLine();
			System.out.println("Enter Products' description: ");
			String description = scn.nextLine();
			System.out.println("Enter Product's price");
			double price = scn.nextDouble();
			System.out.println("Enter Product's quantity: ");
			int qty = scn.nextInt();
			scn.nextLine();
			Product p1 = new Product(id, productName, thumbnail, price, qty, description);
			
			p1.displayInfo();
			System.out.println("Enter quantities to proceed: ");
			int quantityToOrder = scn.nextInt();
			if(p1.checkAvailablity(quantityToOrder)) 
			{
				System.out.println("Enough products to order");
				double totalPrice = p1.placeOrder(quantityToOrder);
				System.out.println("Total price is: " + totalPrice);
			}
			else 
			{
				System.out.println("Not enought to order");
			}
			
	}
}
