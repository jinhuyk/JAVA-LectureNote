package jhmun.midtest3;

public class JhmunVolunteerManager {
	
	private String nameVolunteer;
	private JhmunVolunteer[]  Volunteer;
	private int[] rank = {1,1,1};
	private int count = 0;
	public JhmunVolunteerManager(String nameVolunteer) {
		super();
		this.nameVolunteer = nameVolunteer;
		Volunteer = new JhmunVolunteer[3];
	}
	
	
	public void addVolunteer(JhmunVolunteer volunteer) {
		for(JhmunVolunteer v : this.Volunteer) {
			if(v != null) {
				if((v.getNameVolunteer() ).equals( volunteer.getNameVolunteer())) {
					System.out.println("같은 봉사활동은 중복저장 할 수 없습니다.");
					return;
				}
			}
		}
		if(count < 3) {
			Volunteer[count++] = volunteer;
			System.out.println("등록이 잘 되었습니다.");
		}
		else {
			System.out.println("더이상 추가할 수 없습니다.");
		}
	}
	public JhmunVolunteer findVolunteer(String name) {
		for(JhmunVolunteer v : this.Volunteer) {
			if(v != null) {
				if((v.getNameVolunteer() ).equals( name)) {
					return v;
				}
			}
		}
		return null;
	}
	@Override
	public String toString() {
		
		for(int i =0 ; i< this.count ; i++) {
			for(int j = 0;j<this.count ; j++) {
				if(i!=j) {
					if(this.Volunteer[i].getNowMember() <this.Volunteer[j].getNowMember() )
						rank[i]++;
				}
				
			}
		}
		
		String str = "\n자원봉사명 : "+this.nameVolunteer +"\n";
		str += "등록된 봉사활동 : "+this.count+"명\n";

		str += "-------------------------\n";
		
		if(this.count == 0) {
			str += "신청자가 없습니다.";
		}
		else {
			for(int i =0;i<this.count;i++) {
				str += "\n참여자 순위 :"+rank[i]+"\n";
				str += this.Volunteer[i];
			}
		}
		
		
		return str;
	}
	
	
	
	
}
