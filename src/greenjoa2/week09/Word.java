package greenjoa2.week09;

public class Word {
	String eng;
	String kor;
	public Word(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}
	@Override
	public String toString() {
		return eng+" : " +kor;
	}
	
	
}
