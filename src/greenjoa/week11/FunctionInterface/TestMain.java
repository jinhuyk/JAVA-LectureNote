package greenjoa.week11.FunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;



public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동","2000",52));
		list.add(new Student("이길동","2010",98));
		list.add(new Student("고길동","2002",92));
		list.add(new Student("최길동","2022",68));
		Predicate<Student> con = std-> std.score >=80;
		
		for(Student s : list) {
			if(con.test(s)) {
				System.out.println("on");
			}
		}
		
		
		
		
//		Comparator<Student> cmp =  (o1,o2)-> (o1.score - o2.score)*-1;
//		Collections.sort(list,cmp);
//		System.out.println(list);
	}

}
