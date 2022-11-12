package greenjoa.week11.Stack;

import java.util.Stack;

import greenjoa.week10.Word;



public abstract class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Word> stack = new Stack<>();
		stack.push(new Word("red","빨강"));
		stack.push(new Word("green","초록"));
		stack.push(new Word("blue","파랑"));
		/*
		Iterator<Word> it = stack.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		while(!stack.isEmpty()) {
			Word w = stack.pop();
			System.out.println(w);
		}
	}

}
