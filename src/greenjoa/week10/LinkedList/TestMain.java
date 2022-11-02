package greenjoa.week10.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0;i<10000;i++) {
			arrayList.add(0,i);
		}
		endTime = System.nanoTime();
		
		System.out.println("delta Time ArrayList = "+(endTime-startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 0;i<10000;i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		
		System.out.println("delta Time linkedList = "+(endTime-startTime));
	}

}
