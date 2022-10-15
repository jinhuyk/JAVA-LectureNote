package jhmun.midtest2;

public class JhmunTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("202210748 문진혁");
		
		System.out.println("2) Member 객체 생성 및 출력하기");
		JhmunMember gdhong = new JhmunMember("홍길동");
		System.out.println(gdhong);
		JhmunMember gdKim = new JhmunMember("김길동");
		JhmunMember gdLee = new JhmunMember("이길동");
		JhmunMember gdChoi = new JhmunMember("최길동");
		JhmunMember gdPark = new JhmunMember("박길동");
		
		System.out.println("3) Volunteer 추상 클래스 만들기");
		//JhmunVolunteerr volunteer1 = new JhmunVolunteer ("김길동 어린이 돕기",5);
		
		System.out.println("4) Donation (물적기부) 객체 만들기");
		JhmunVolunteer volunteer1 = new JhmunDonation("김길동 어린이 돕기",5);
		System.out.println(volunteer1);
		
		System.out.println("5) TalentDonation (재능기부) 객체만들기");
		JhmunVolunteer volunteer2 = new JhmunTalentDonation("농촌 미용 봉사활동",2,"미용기술");
		System.out.println(volunteer2);
		
		System.out.println("6) VolunteerManager 객체 만들기");
		JhmunVolunteerManager greenjoa = new JhmunVolunteerManager("그린세상만들기");
		System.out.println(greenjoa);
		
		System.out.println("7) 봉사활동 추가하기");
		greenjoa.addVolunteer(new JhmunTalentDonation("농촌 미용 봉사활동",2,"미용기술"));
		greenjoa.addVolunteer(new JhmunDonation("김길동 어린이 돕기",3));
		greenjoa.addVolunteer(new JhmunDonation("김길동 어린이 돕기",2));
		greenjoa.addVolunteer(new JhmunTalentDonation("독거노인 도배 봉사활동",3,"도배기술"));
		greenjoa.addVolunteer(new JhmunTalentDonation("섬마을 미용 봉사활동",1,"미용기술"));
		
		System.out.println("8-1) 봉사활동 검색 및 참여하기 -물적봉사의 경우");
		JhmunVolunteer v1 = greenjoa.findVolunteer("김길동 어린이 돕기");
		v1.join(gdhong);
		v1.join(gdhong);
		v1.join(gdKim);
		v1.join(gdLee);
		v1.join(gdChoi);
		System.out.println();
		System.out.println(v1);
		
		System.out.println("8-2) 봉사활동 검색 및 참여하기 -재능봉사의 경우");
		JhmunVolunteer v2 = greenjoa.findVolunteer("농촌 미용 봉사활동");
		v2.join(gdhong);
		v2.join(gdhong);
		v2.join(gdKim);
		v2.join(gdPark);
		System.out.println();
		System.out.println(v2);
		
		System.out.println("9) VolunteerManager 출력하기");
		System.out.println(greenjoa);
	}

}
