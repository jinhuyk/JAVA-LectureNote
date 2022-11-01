package greenjoa.week10;

import java.util.Vector;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VocManager voc = new VocManager("홍길동");
		//voc.makeVoc("words.txt");
		/*
		MyArray<Integer> intarr = new MyArray<Integer>(5);
		intarr.add(10);
		intarr.add(20);
		Integer num = intarr.getElement(2);
		
		MyArray<String> strarr =  new MyArray<>(10);
		strarr.add("gj1");
		strarr.add("ard2");
		String str = strarr.getElement(1);
		
		System.out.println(num);
		System.out.println(str);
		*/
		
		Vector<Word> word = new Vector<>();
		word.add(new Word("green","녹색"));
		word.add(new Word("red","적색"));
		word.add(new Word("blue","청색"));
		
		word.remove(new Word("red","적색"));
		
		for ( Word e : word) {
			System.out.println(e);
		}
	}
}
