package greenjoa.week11.LambdaExpression;

public class Student implements Comparable<Student>{
	String sname;
	String sid;
	int score;

	public Student(String sname) {
		this(sname,"noinfo",0);
	}
	public Student(String sname, String sid, int score) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.score = score;
	}
	@Override
	public String toString() {
		return this.sname + " : " +this.sid+" : "+this.score;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.sid.compareTo(o.sid);
		//return this.score - o.score;
	}
	
}
