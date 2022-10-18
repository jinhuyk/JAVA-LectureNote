package jhmun.midtest3;

import java.util.Scanner;

public class JhmunDonation extends JhmunVolunteer {
	
	
	
	private int totalDonation;
	Scanner scan = new Scanner(System.in);
	public JhmunDonation(String nameVolunteer, int ableMember) {
		super(nameVolunteer, ableMember);
		this.nowMember = 0;
		this.totalDonation = 0;
		this.Member = new JhmunMember[this.ableMember];
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
	public void join(JhmunMember m) {
		System.out.print(m.getNameMember()+"님 기부할 금액을 입력해주세요 :");
		String str = scan.next();
		while(!isNumber(str)) {
			System.out.println("다시 입력해주세요");
			str = scan.next();
		}
		int money = Integer.parseInt(str);
		if(money < 100) {
			System.out.println(m.getNameMember()+"님 최소가부금은 100원 이상이 되어야 합니다.");
		}
		else {
			for(JhmunMember member : this.Member) {
				if(member != null) {
					if(member == m) {
						member.setTotalDonation(member.getTotalDonation() + money);
						member.setCountVolunteer(member.getCountVolunteer()+1);
						this.totalDonation += money;
						System.out.println("기부가 완료되었습니다.");
						return;
					}
				}
			}
			this.Member[this.nowMember++] = m;
			m.setTotalDonation(m.getTotalDonation() + money);
			m.setCountVolunteer(m.getCountVolunteer()+1);
			this.totalDonation += money;
			System.out.println("기부가 완료되었습니다.");
			return;
		}
		
	}
	
	@Override
	public String toString() {
		
		for(int i = 0;i<this.nowMember;i++) {
			for(int j =i;j<this.nowMember;j++) {
				if(i!=j) {
					if(this.Member[i].getTotalDonation() < this.Member[j].getTotalDonation()) {
						JhmunMember temp = this.Member[j];
						this.Member[j] = this.Member[i];
						this.Member[i] = temp;
					}
				}

			}
		}
		String str = "자원봉사명 : "+this.nameVolunteer +"\n";
		str += "참여가능 인원 : "+this.ableMember+"명\n";
		str += "현재 참여인원 : "+this.nowMember+"명\n";
		str += "기부금 총액 : "+this.totalDonation+"원\n";
		str += "참여자 명단 (기부금액이 큰 순서)\n";
		str += "-------------------------\n";
		
		if(this.nowMember == 0) {
			str += "신청자가 없습니다.";
		}
		else {
			for(JhmunMember member : this.Member) {
				if(member != null) {
					str += member;
				}
			}
		}
		
		
		return str;
	}
	public String getNameVolunteer() {
		return nameVolunteer;
	}
	public void setNameVolunteer(String nameVolunteer) {
		this.nameVolunteer = nameVolunteer;
	}
	
	
}
