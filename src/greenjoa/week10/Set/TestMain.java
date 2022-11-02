package greenjoa.week10.Set;

import java.util.HashSet;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Word> set = new HashSet<>();
		set.add(new Word("green","녹색"));
		set.add(new Word("red","적색"));
		set.add(new Word("blue","청색"));
		set.add(new Word("green","녹색"));
		set.add(new Word("red","적색"));
		set.add(new Word("blue","청색"));
		
		
		System.out.println(set);

	}

}
