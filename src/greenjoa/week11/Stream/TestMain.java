package greenjoa.week11.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동","2000",52));
		list.add(new Student("김길동","2011",92));
		list.add(new Student("고길동","2009",82));
		list.add(new Student("이길동","2022",62));
		
//		Stream<Student> stream = list.stream();
//		list.stream()
//		.sorted((o1,o2)->o1.sname.compareTo(o2.sname))
//		.limit(2)
//		.forEach(System.out::println);
		List<Student> flist =list.stream().filter(std->std.score >=80).collect(Collectors.toList());
		int sum = list.stream().collect(Collectors.summingInt(Student::getScore));
		System.out.println(sum);
		
		double avg = list.stream().collect(Collectors.averagingInt(Student::getScore));
		System.out.println(avg);
	}

}
