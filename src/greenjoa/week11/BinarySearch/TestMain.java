package greenjoa.week11.BinarySearch;

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
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동","2000",52));
		list.add(new Student("이길동","2010",98));
		list.add(new Student("고길동","2002",72));
		list.add(new Student("최길동","2022",68));
		
		Collections.sort(list);
		int idx= Collections.binarySearch(list,new Student("","2010",0) );
		if(idx >= 0) {
			System.out.println(list.get(idx));
		}
		else System.out.println("없음");
		
		Collections.sort(list,new StdComparator(3));
		idx= Collections.binarySearch(
				list,
				new Student("홍길동","",0), new StdComparator(3)
				);
		if(idx >= 0) {
			System.out.println(list.get(idx));
		}
		else System.out.println("없음");
	}	

}
