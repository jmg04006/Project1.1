package Project1Package;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductCollection {

		private static final int DEFAULT_SIZE = 10; 
		private ArrayList<Product> products; 
		//private String fileName; 
	
		//Default constructor
		public ProductCollection() {
			products = new ArrayList<Product>(DEFAULT_SIZE);
			//fileName = null; 
		}
		//Parameterized constructor
		public ProductCollection(int size, String fileName) {
			super();
			//this.fileName = fileName;
			//readFile(); 
		}
		//Method to add product
		public void addProduct(Product p) {
			//Method that adds the input Product to the arrylist
			products.add(products.size(), p);
		}
		//Method to update/remove a product in the collection
		public Product removeProduct(int id) {
			int index = 0; 
			while(index < products.size() && products.get(index).getId() != id) {
				index++; 
			}
			if (index == products.size()) {
				return null; 
			}
			else {
				if(products.get(index).getQuantity() > 1) {
					int decriment = products.get(index).getQuantity() - 1;  
				products.get(index).setQuantity(decriment);
				Product toReturn = products.get(index); 
				products.remove(index); 
				System.out.println("\nThe product removed is: ");
				return toReturn; 
				}
				else {
				Product toReturn = products.get(index); 
				products.remove(index); 
				System.out.println("\nThe product removed is: ");
				return toReturn;
				}
				
				
			}
			  
		}
		//Method to retrieve a product
		public Product retrieve(int id) {
			for(int i = 0; i < products.size(); i++) {
				if(products.get(i).getId() == id) {
					System.out.println("The product retreived is: ");
					return products.get(i);  
				}

		}
			return null; 
		}
		//Method to retrieve a collection of products
		public ArrayList<Product> retrieveCollect(String n){
			ArrayList<Product> toReturn = new ArrayList<Product>(DEFAULT_SIZE);
			int index = 0; 
			for(int i = 0; i < products.size(); i++) {
				if(products.get(i).getCategory().equals(n)) {
					toReturn.add(products.get(i));
					index++; 
				}
			}
			if (index == 0) {
				return null; 
			}
			else {
				return toReturn; 
			}
		}
		//Method to remove all
		public ArrayList<Product> removeAll(String n){
			ArrayList<Product> toReturn = new ArrayList<Product>(DEFAULT_SIZE);
			int index = 0; 
			for(Iterator<Product> it = products.iterator(); it.hasNext();) {
				Product p = it.next(); 
				if(p.getCategory().equals(n)) {
					toReturn.add(p);
					it.remove(); 
					index++; 
				}
			}
			if (index == 0) {
				return null; 
			}
			else {
				return toReturn; 
			}
		}
		//returns a string represention of this productcollection
		public String toString() {
			String toReturn = new String(); 
			toReturn = "\nThe productCollection includes: \n"; 
			for(int i = 0; i < products.size(); i++) {
				toReturn += products.get(i)+"\n";
			}
			return toReturn; 
		}
		//Method to provide a suggestion
		public Product suggestion(String s) {
			int index = 0; 
			ArrayList<Product> sugg = new ArrayList<Product>(DEFAULT_SIZE);
			for(int i = 0; i < products.size(); i++) {
				if(products.get(i).getCategory().equals(s)) {
					sugg.add(products.get(i)); 
					index++; 
				}
			}
			if(index == 0) 
			return null; 
			else {
				return sugg.get((int) (Math.random()*sugg.size())) ;

			}
			
			
		}
//		//Equals method
//		public boolean equals(Object o) {
//			return ((Product)o).getId().equals(); 
//		}
		
		
		
}
