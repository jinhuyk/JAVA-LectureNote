package jhmun.midtest2;

public abstract class JhmunVolunteer {
	protected String nameV;
	protected int memberAble;
	protected int Rank;
	protected JhmunMember[] Member;
	public JhmunVolunteer(String nameV, int memberAble) {
		super();
		this.nameV = nameV;
		this.memberAble = memberAble;
	}

	public abstract void join(JhmunMember member);
	public abstract int getMemberNow();
}
