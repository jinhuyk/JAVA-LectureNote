package greenjoa.week07;

public class testMain {

	public static void main(String[] args) {
		System.out.println("202210748 문진혁");
		TicketManager ticket = new TicketManager("아이유콘서트",10);
		//ticket.register(new Ticket(1,1000));
		ticket.register(new AdvanceTicket(1,1000.0,32));
		ticket.register(new AdvanceTicket(2,2000.0,9));
		ticket.register(new AdvanceTicket(3,1000.0,15));
		ticket.register(new AdvanceTicket(4,1000.0,12));
		ticket.showAdvanceTicket(10);

	}

}
