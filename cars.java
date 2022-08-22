package carRegulator;

public class cars {
	private String model;
	private double price;
	private int piece;
	private String seller;
	
	public cars(String model, double price, String seller) {
		this.model=model;
		this.price=price;
		this.seller=seller;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setPiece(int piece) {
		this.piece=piece;
	}
	public double getPiece() {
		return piece;
	}
	public void setPiece(double price) {
		this.price = price;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	/*public void setCarInformation(String model ,double price,String seller) {
		this.model=model;
		this.price=price;
		this.seller=seller;
	}*/
	
	public void printInfo(){
		System.out.println("The "+this.model+" model car is selling for "+this.price+" in the "+this.seller+" car gallery.");
	}











}





