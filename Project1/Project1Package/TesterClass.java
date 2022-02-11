package Project1Package;

import java.util.ArrayList;

public class TesterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test for product default constructor
		Product item = new Product(); 
		System.out.println(item); 
		
		//Test for product parameterized constructor
		Product item2 = new Product(1,"barbell","25lb",25.00,10); 
		Product item3 = new Product(2,"dumbbell","10lb",10.00,1);
		System.out.println(item2); 
		
		//Test for getters and setters of product class
		
		//Test product collection creation and add method
		ProductCollection inventory = new ProductCollection(); 
		System.out.println(inventory);
		inventory.addProduct(item2);
		inventory.addProduct(item3); 
		System.out.println(inventory);

		//Test retreive method
		Product retrieved = inventory.retrieve(1); 
		System.out.println(retrieved);
		Product retrieved2 = inventory.retrieve(100); 
		System.out.println(retrieved2);

		//Test removeProduct method
		Product removed = inventory.removeProduct(1); 
		System.out.println(removed); 
		Product removed2 = inventory.removeProduct(100);
		System.out.println(removed2); 
		 
		//Test for product collection retrieval 
		Product item4 = new Product(4,"barbell","25lb",25.00,1); 
		inventory.addProduct(item4);
		inventory.addProduct(item2);
		System.err.println("\nThe collection retreival includes: ");
		ArrayList<Product> retrieveCollect = inventory.retrieveCollect("barbell"); 
		System.out.println(retrieveCollect);
		ArrayList<Product> retrieveCollect2 = inventory.retrieveCollect("medball"); 
		System.out.println(retrieveCollect2);
			
		//Test for remove all
		System.err.println("\nThe products removed include: ");
		ArrayList<Product> allRemoved = inventory.removeAll("barbell"); 
		System.out.println(allRemoved); 
		System.out.println(inventory);
		
		//Test for suggestion
		inventory.addProduct(item2);
		inventory.addProduct(item4);
		Product p = inventory.suggestion("barbell"); 
		System.out.println("Here is a similair product: " +p); 
		Product p2 = inventory.suggestion("leg press"); 
		System.out.println(p2);


	}

}
