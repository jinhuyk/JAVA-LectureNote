package jhmun.midtest2;

import java.util.Scanner;

public class JhmunDonation extends JhmunVolunteer{

	private int totalDon;
	private int memberNow=0;
	Scanner scan = new Scanner(System.in);
	public JhmunDonation(String nameV, int memberAble) {
		super(nameV, memberAble);
		
		this.Member = new JhmunMember[this.memberAble];
		
		// TODO Auto-generated constructor stub
	}

	public boolean IsNum(String moneys) {
		try {
			Integer.parseInt(moneys);
			return true;
		} catch (NumberFormatException e) {
			return false;
			
		}
	}

	@Override
	public void join(JhmunMember member) {
		int check = 0;
		if(this.memberNow < this.memberAble) {
			for(JhmunMember mb : this.Member) {
				if(mb != null) {
					if((mb.getName()).equals(member.getName())) {
						check = 1;
						break;
					}
					
				}
			}
			
			System.out.print(member.getName() +"님 기부할 금액을 입력해 주세요 : ");
			String moneys = scan.next();
		
			while(!IsNum(moneys)) {
				System.out.println("다시 입력해주세요");
				moneys = scan.next();
			}
			int money = Integer.parseInt(moneys);
			if(money < 100) {
				System.out.println(member.getName() +"님, 최소 기부금은 100원 이상이 되어야 합니다.");
				return;
			}
			else {
				if(check == 0) {
					this.Member[this.memberNow++] = member;
				}

				System.out.println(member.getName() +"님, 기부가 완료되었습니다. 감사합니다.");
				member.setCountV(member.getCountV()+1);
				member.setTotalDonation(member.getTotalDonation()+money);
				this.totalDon += money;
			}
		}
	}
	@Override
	public String toString() {
		for(int i = 0;i<this.memberNow;i++) {
			for(int j = i;j<this.memberNow;j++) {
				if(i != j) {
					if(Member[i].getTotalDonation() < Member[j].getTotalDonation()) {
						JhmunMember tmp = Member[i];
						Member[i] = Member[j];
						Member[j] = tmp;
					}
				}
			}
		}
		
		
		
		String str = "자원봉사명 : "+this.nameV +"\n";
		str += "참여가능인원 : "+this.memberAble+"명\n";
		str += "현재참여인원 : "+this.memberNow+"명\n";
		str += "기부금 총액 : "+this.totalDon+"원\n";
		str+= "참여자 명단(기부금액이 큰 순서)\n";
		str += "-------------------------\n";
		if(this.memberNow==0) System.out.println("신청자가 없습니다.");
		else {
			for(JhmunMember mb : this.Member) {
				if(mb != null) {
					str += mb +"\n";
				}
			}
		}
		return str;

	}

	public int getMemberNow() {
		return memberNow;
	}




	

	
	
}
