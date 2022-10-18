package jhmun.midtest3;

import java.util.Scanner;

public class JhmunTalentDonation extends JhmunVolunteer {
	Scanner scan = new Scanner(System.in);
	private String nameTalent;
	public JhmunTalentDonation(String nameVolunteer, int ableMember,String nameTalent) {
		super(nameVolunteer, ableMember);
		this.nowMember = 0;
		this.nameTalent = nameTalent;
		this.Member = new JhmunMember[this.ableMember];
		
		
		
	}
	
	public void join(JhmunMember m) {
		for(JhmunMember member : this.Member) {
			if(member != null) {
				if(member == m) {
					System.out.println("동일한 봉사활동에는 한번만 신청할 수 있습니다.");
					return;
				}
			}
		}
		System.out.print(m.getNameMember()+"님 기부할 금액을 입력해주세요 :");
		String str = scan.next();
		
		if(!str.equals(this.nameTalent)){
			System.out.println("해당봉사활동에서 필요로 하는 재능과 일치하지 않습니다. 다른 기부화롱에 동참해주세요");
			return;
			
		}
		else {
			
			this.Member[this.nowMember++] = m;
			m.setCountVolunteer(m.getCountVolunteer()+1);

			System.out.println("기부가 완료되었습니다.");
			return;
		}
		
	}
	@Override
	public String toString() {
		
		
		String str = "자원봉사명 : "+this.nameVolunteer +"\n";
		str += "참여가능 인원 : "+this.ableMember+"명\n";
		str += "현재 참여인원 : "+this.nowMember+"명\n";
		str += "봉사할 재능 : "+this.nameTalent+"\n";
		
		str += "참여자 명단\n";
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
