package greenjoa.week10.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Word> word = new ArrayList<>();
		word.add(new Word("green","녹색"));
		word.add(new Word("red","적색"));
		word.add(new Word("blue","청색"));
		
		Iterator<Word> it = word.iterator();
		while(it.hasNext()){
			Word w = it.next();
			if(w.equals(new Word("green","녹색"))) {
				it.remove();
			}
		}
		System.out.println(word);
	}


}
