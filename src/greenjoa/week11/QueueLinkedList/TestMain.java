package greenjoa.week11.QueueLinkedList;

import java.util.LinkedList;
import java.util.Queue;

import greenjoa.week10.Word;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			Queue<Word> queue = new LinkedList<>();
			queue.offer(new Word("red","빨강"));
			queue.offer(new Word("green","초록"));
			queue.offer(new Word("blue","파랑"));
			/*
			Iterator<Word> it = stack.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			*/
			while(!queue.isEmpty()) {
				Word w = queue.poll();
				System.out.println(w);
			}
	}

}
