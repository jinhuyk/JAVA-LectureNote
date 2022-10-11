package greenjoa.week07;

public abstract class Ticket {
	protected int number;
	protected double price;
	
	
	public Ticket(int number) {
		this(number,0.0);
	}
	public Ticket(int number,double price) {
		this.number = number;
		this.price = price;
		
		
	}
  
	public abstract double getPrice();
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [number=" + number + ", price=" + price + "]";
	}
	
	
}
