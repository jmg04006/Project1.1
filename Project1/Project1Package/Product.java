package Project1Package;

public class Product {
		private int id; 
		private String category; 
		private String model; 
		private double price; 
		private int quantity;
		
		//Default constructor
		public Product() {
			id = -1;
			category = "not set"; 
			model = "not set"; 
			price = -1; 
			quantity = -1; 
					
		}
		//Parameterized constructor
		
		
		
		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}
	
		public Product(int id, String category, String model, double price, int quantity) {
			super();
			this.id = id;
			this.category = category;
			this.model = model;
			this.price = price;
			this.quantity = quantity;
		}
		
	
		public String getCategory() {
			return category;
		}



		public void setCategory(String category) {
			this.category = category;
		}



		public String getModel() {
			return model;
		}



		public void setModel(String model) {
			this.model = model;
		}



		public double getPrice() {
			return price;
		}



		public void setPrice(double price) {
			this.price = price;
		}



		public int getQuantity() {
			return quantity;
		}



		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}



		public void setId(int id) {
			this.id = id;
		}



		//String representation of the product
		public String toString() {
			return "id: " +id+" category: "+category+" model: "+model+" price: "+price+" quantity: "+quantity; 
		}
		
}
