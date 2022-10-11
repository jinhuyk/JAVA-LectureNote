package jhmun.midtest;

import java.util.Scanner;

public class JhmunTalentDonation extends JhmunVolunteer {
	Scanner scan = new Scanner(System.in);
	private static int nowMember;
	private String talent;
	private JhmunMember[] member;
	public JhmunTalentDonation(String name, int totalMember, String talent) {
		this(name, totalMember,0,talent);
	}
	public JhmunTalentDonation(String name, int totalMember, int nowMember, String talent) {
		super(name, totalMember);
		this.nowMember = nowMember;
		this.talent = talent;
		
		member = new JhmunMember[this.TOTALMEMBER];
	}
	public static void sortMember(JhmunMember[] mem) {
		if(nowMember>0) {
			for(int i =0;i<nowMember-1;i++) {
				int min = i;
				for(int j = i;j<nowMember;j++) {
					if(mem[min].getTotalDonation() > mem[j].getTotalDonation()) min=j;
				}
				if(min != i) {
					JhmunMember temp = mem[min];
					mem[min] = mem[i];
					mem[i] = temp;
				}
			}
		}
		

	}
	public void join(JhmunMember mem) {
		for(JhmunMember memb : member) {
			if(memb!=null) {
				if((mem.getName()).equals(memb.getName())) {
					System.out.println(mem.getName()+"님 동일한 봉사활동에는 한번만 신청할 수 있습니다.");
					return;
				}
			}
		}
		String nameTalent;
		System.out.print(mem.getName()+"님 기부할 재능을 입력해주세요 : ");
		nameTalent = scan.next();
		if(!nameTalent.equals( this.talent)) {
			System.out.println("해당봉사활동에서 필요로하는 재능과 일치하지 않습니ㅏㄷ. 다른 기부활동에 동참해주세요.");
			return;
		}
		else {
			
			if(this.TOTALMEMBER > this.nowMember) {
				member[nowMember++] = mem;
				mem.setOnVolunteer(mem.getOnVolunteer()+1);
				System.out.println(mem.getName()+"님의 신청이 완료되었습니다. 감사합니다.");
			}
		}

		
	}
	@Override
	public String toString() {
		String str = "자원봉사명 : "+this.name+"\n";
		str +="참여가능 인원 : "+this.TOTALMEMBER+"명\n";
		str +="현재 참여인원 : "+this.nowMember+"명\n";
		str += "봉사할 재능 : "+this.talent+"\n";
		str += "참여자 명단\n";
		str += "-------------------------\n";
		if(this.nowMember == 0) {
			str += "신청자가 없습니다.";
		}
		sortMember(member);
		for(JhmunMember mem : member)
		{
			if(mem != null) str += mem;
		}
		return str;
				
	}
	
	
}
