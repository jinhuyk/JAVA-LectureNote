package jhmun.midtest;

import java.util.Arrays;
import java.util.Scanner;

public class JhmunDonation extends JhmunVolunteer {
	Scanner scan = new Scanner(System.in);
	private int totalDonation;
	private static int nowMember;
	private JhmunMember[] member;
	public JhmunDonation(String name, int TOTALMEMBER) {
		this(name, TOTALMEMBER, 0, 0);
	}
	public JhmunDonation(String name, int TOTALMEMBER, int totalDonation, int nowMember) {
		super(name, TOTALMEMBER);
		this.totalDonation = totalDonation;
		this.nowMember = nowMember;
		
		member = new JhmunMember[this.TOTALMEMBER];
		
	}
	
	public static void sortMember(JhmunMember[] mem) {
		if(nowMember>0) {
			for(int i =0;i<nowMember-1;i++) {
				int max = i;
				for(int j = i;j<nowMember;j++) {
					if(mem[max].getTotalDonation() < mem[j].getTotalDonation()) max=j;
				}
				if(max != i) {
					JhmunMember temp = mem[max];
					mem[max] = mem[i];
					mem[i] = temp;
				}
			}
		}
		

	}
	public static boolean isInt(String str) {
		try {
			int x = Integer.parseInt(str);
			return true;
		} catch(NumberFormatException e) {
			
			return false;
		}
	}
	public void join(JhmunMember mem) {
		String money;
		while(true) {
			
			System.out.print(mem.getName()+"님 기부할 금액을 입력해주세요 : ");
			money = scan.next();
			if(isInt(money)) {
				break;
			}
			System.out.println("다시 입력해주세요");
		}
		int moneyint = Integer.parseInt(money);
		if(moneyint <100) {
			System.out.println("최소기부금은 100원 이상이 되어야합니다.");
			return;
		}
		else {
			for(JhmunMember memb : member) {
				if(memb!=null) {
					if((mem.getName()).equals(memb.getName())) {
						mem.setOnVolunteer(mem.getOnVolunteer()+1);
						mem.setTotalDonation(mem.getTotalDonation()+moneyint);
						System.out.println(mem.getName()+"님의 기부가 완료되었습니다. 감사합니다.");
						return;
					}
				}
			}
			if(this.TOTALMEMBER > this.nowMember) {
				member[nowMember++] = mem;
				mem.setOnVolunteer(mem.getOnVolunteer()+1);
				mem.setTotalDonation(mem.getTotalDonation()+moneyint);
				System.out.println(mem.getName()+"님의 기부가 완료되었습니다. 감사합니다.");
			}

		}
			
		
	}
	@Override
	public String toString() {
		String str = "자원봉사명 : "+this.name+"\n";
		str +="참여가능 인원 : "+this.TOTALMEMBER+"명\n";
		str +="현재 참여인원 : "+this.nowMember+"명\n";
		str += "기부금 총액 : "+this.totalDonation+"원 \n";
		str += "참여자 명단 (기부금액이 큰 순서)\n";
		str += "-------------------------\n";
		sortMember(member);
		if(this.nowMember == 0) {
			str += "신청자가 없습니다.";
		}
		for(JhmunMember mem : member)
		{
			if(mem != null) str += mem;
		}
		return str;
				
	}
	
	

	
}
