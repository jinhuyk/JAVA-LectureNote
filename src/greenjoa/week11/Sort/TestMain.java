package greenjoa.week11.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StdComparator implements Comparator<Student>{
	int flag = 0;
	
	public StdComparator(int flag) {
		super();
		this.flag = flag;
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		switch(this.flag) {
		case 1: return (o1.score-o2.score)*-1;
		case 2: return o1.score-o2.score;
		case 3: return o1.sname.compareTo(o2.sname);
		default:return o1.sname.compareTo(o2.sname)*-1;
		}

	}
	
}


public class TestMain {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동","2000",52));
		list.add(new Student("이길동","2010",98));
		list.add(new Student("고길동","2002",72));
		list.add(new Student("최길동","2022",68));

//		Collections.sort(list);
		
		//StdComparator cmp= new StdComparator();
		Collections.sort(list,new StdComparator(1));
		System.out.println(list);
		

		Collections.sort(list,new StdComparator(3));
		Collections.shuffle(list);
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.score - o1.score;
			}
			
		});
//		Collections.reverse(list);
		
		System.out.println(list);
		// TODO Auto-generated method stub
//		Integer[] arr = { 10,1,2,78,3,7,9};
//		List<Integer> list = Arrays.asList(arr);
//		List<Integer> list2 = new ArrayList<>();
//		Collections.addAll(list2, arr);
//		
//		
//		
//		Collections.sort(list2);
//		System.out.println(list);
	}

}

