package jhmun.midtest2;

import java.util.Scanner;

public class JhmunTalentDonation extends JhmunVolunteer{

	Scanner scan = new Scanner(System.in);
	private String nameTalent;
	private int memberNow;
	public JhmunTalentDonation(String nameV, int memberAble,String nameTalent) {
		super(nameV, memberAble);
		this.nameTalent = nameTalent;
		this.memberNow = 0;
		// TODO Auto-generated constructor stub
		this.Member = new JhmunMember[this.memberAble];
	}
	
	
	public int getMemberNow() {
		return memberNow;
	}




	public void join(JhmunMember member) {
		int check = 0;
		if(this.memberNow < this.memberAble) {
			for(JhmunMember mb : this.Member) {
				if(mb != null) {
					if((mb.getName()).equals(member.getName())) {
						System.out.println(member.getName() +"님, 동일한 봉사활동에는 한번만 신청할 수 있습니다..");
						return;
					}
					
				}
			}
			
			System.out.print(member.getName() +"님 기부할 재능을 입력해 주세요 : ");
			String talent = scan.next();
		

			if(!talent.equals(this.nameTalent)) {
				System.out.println("해당 봉사활동에서 필요로 하는 재능과 일치하지 않스빈다. 다른 기부활도에 동참해 주세요.");
				return;
			}
			else {
				if(check == 0) {
					this.Member[this.memberNow++] = member;
				}

				System.out.println(member.getName() +"님, 신청이 완료되었습니다. 감사합니다.");
				member.setCountV(member.getCountV()+1);
			}
		}
	}
	@Override
	public String toString() {
		String str = "자원봉사명 : "+this.nameV +"\n";
		str += "참여가능인원 : "+this.memberAble+"명\n";
		str += "현재참여인원 : "+this.memberNow+"명\n";
		str += "봉사할 재능 : "+this.nameTalent+"\n";
		str+= "참여자 명단\n";
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

	
}
