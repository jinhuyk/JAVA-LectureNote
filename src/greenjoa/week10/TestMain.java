package greenjoa.week10;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VocManager voc = new VocManager("홍길동");
		voc.makeVoc("words.txt");
		/*
		ArrayList<Integer> intarr = new ArrayList<Integer>(5);
		intarr.add(10);
		intarr.add(20);
		Integer num = intarr.getElement(2);
		
		MyArray<String> strarr =  new MyArray<>(10);
		strarr.add("gj1");
		strarr.add("ard2");
		String str = strarr.getElement(1);
		
		System.out.println(num);
		System.out.println(str);
		
		
		ArrayList<Word> word = new ArrayList<>();
		word.add(new Word("green","녹색"));
		word.add(new Word("red","적색"));
		word.add(new Word("blue","청색"));
		
		int index = word.indexOf(new Word("green","초록"));
		
		word.toArray(new Word[word.csize()]);
		

		for ( Word e : word) {
			System.out.println(e);
		}
		*/
	}
}
