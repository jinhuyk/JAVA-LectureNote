package jhmun.midtest2;

public class JhmunVolunteerManager {
	private String nameClub;
	private int count=0;
	private JhmunVolunteer[] Volunteer = new JhmunVolunteer[3];
	
	public JhmunVolunteerManager(String nameClub) {
		super();
		this.nameClub = nameClub;
	}
	
	public void addVolunteer(JhmunVolunteer Volunteer) {
		if(count < 3) {
			
			for(JhmunVolunteer vt :this.Volunteer) {
				if(vt != null) {
					if((vt.nameV).equals(Volunteer.nameV)) {
						System.out.println("같은 봉사활동은 중복저장 할 수 없습니다.");
						return;
					}
				}
			}
			
			this.Volunteer[count++] = Volunteer;
			System.out.println("등록이 잘 되었습니다.");
			return;
		}
		else {
			System.out.println("더이상 추가할 수 없습니다.");
			return;
		}
	}
	public JhmunVolunteer findVolunteer(String name) {
		for(JhmunVolunteer vt :this.Volunteer) {
			if(vt != null) {
				if((vt.nameV).equals(name)) {
					
					return vt;
				}
			}
		}
		return null;
		
	}
	@Override
	public String toString() {

		JhmunVolunteer[] Ranki = Volunteer;
		for(int i = 0;i<this.count;i++) {
			for(int j = i;j<this.count;j++) {
				if(i != j) {
					if(Ranki[i].getMemberNow() < Ranki[j].getMemberNow() ) {
						JhmunVolunteer tmp = Ranki[i];
						Ranki[i] = Ranki[j];
						Ranki[j] = tmp;
					}
				}
				Ranki[i].Rank = i+1;
			}
		}

		
		String str = "봉사단체명 : "+this.nameClub +"\n";
		str += "등록된 봉사활동 : "+this.count+"\n";

		str += "--------봉사활동 현황 리스트 -------";
		
		if(this.count==0) System.out.println("등록된 봉사활동이 없습니다.");
		else {
			for(JhmunVolunteer vt : this.Volunteer) {
				if(vt != null) {
					str += "참여자 순위 :"+vt.Rank+"\n";
					str += vt +"\n";
				}
			}
		}
		return str;

	}
	
}
