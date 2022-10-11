package jhmun.midtest;

public class JhmunVolunteerManager {
	private String name;
	private int count = 0;
	private JhmunVolunteer[] volunteer;
	public JhmunVolunteerManager(String name) {
		this.name = name;
		
		volunteer = new JhmunVolunteer[3];
	}
	
	
	public void addVolunteer(JhmunVolunteer volunteer) {
		if(this.count >=3 )System.out.println("더이상 추가할 수 없습니다.");
		else {
			for(JhmunVolunteer vol : this.volunteer) {
				if(vol!=null) {
					if((volunteer.name).equals(vol.name)) {
						System.out.println("같은 봉사활동은 중복저장할 수 없습니다.");
						return;
					}
				}
			}
			this.volunteer[count] = volunteer;
			this.count++;
			System.out.println("등록이 잘 되었습니다.");
		}	
	}
	
	public JhmunVolunteer findVolunteer(String name) {
		for(JhmunVolunteer vol : this.volunteer) {
			if(vol!=null) {
				if(name.equals(vol.name)) {
					return vol;
				}
			}
		}
		return null;
	}
	@Override
	public String toString() {
		
		String str = "봉사단체명 : "+this.name+"\n";
		str +="등록된 봉사활동  : "+this.count+"\n";
		str += "------ 봉사활동 현황 리스트 -----------\n";
		if(this.count == 0) {
			str += "등록된 봉사활동이 없습니다.";
		}
		else {
			str+= "참여자 순위 : ";
			for(JhmunVolunteer vnt : volunteer)
			{
				if(vnt != null) str += vnt;
			}
		}

		return str;
				
	}
	
}
