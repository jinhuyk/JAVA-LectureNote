package greenjoa.week10;

public class MyArray <E> {
	private int capacity;
	private int count=0;
	private E[] arr;
	@SuppressWarnings("unchecked")
	public MyArray(int capacity) {
		super();
		this.capacity = capacity;
		this.arr = (E[])new Object[this.capacity];
	}
	public void add(E data) {
		if(this.count < this.capacity) {
			this.arr[count++] = data;
		}
		else {
			System.out.println("공간부족");
		}
	}
	public E getElement(int idx) {
		if(idx >= 0 && idx < count)
			return this.arr[idx];
		else 
			return null;
		
	}
	
	
}
