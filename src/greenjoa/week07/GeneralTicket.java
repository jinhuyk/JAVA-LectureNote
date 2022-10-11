package greenjoa.week07;

public class GeneralTicket extends Ticket {

	private boolean payByCredit;

	public GeneralTicket(int number, boolean payByCredit) {
		this(number,0.0,payByCredit);
	}
	public GeneralTicket(int number, double price, boolean payByCredit) {
		super(number, price);
		this.payByCredit = payByCredit;
	}
	public boolean isPayByCredit() {
		return payByCredit;
	}
	public void setPayByCredit(boolean payByCredit) {
		this.payByCredit = payByCredit;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		
		if(this.isPayByCredit()) return this.price*1.1;
		return this.price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = super.toString();
		str += "\n카드결제 : "+this.isPayByCredit();
		str += "\n결재금액 : "+this.getPrice()+"\n";
		return str;
	}
	  
	
	//public GeneralTicket(int number) {
	//	super(number);
	//}
}
