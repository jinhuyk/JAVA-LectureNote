package jhmun.midtest;

public abstract class JhmunVolunteer {
	protected String name;
	protected final int TOTALMEMBER;
	public JhmunVolunteer(String name, int totalMember) {
		this.name = name;
		this.TOTALMEMBER = totalMember;
	}
	public abstract void join(JhmunMember mem);
	
	
}
