package greenjoa2.week09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VocManager {
	private String userName;
	private Word[] voc = new Word[100];
	private int number = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	VocManager(String userName){
		this.userName = userName;
		
	}
	
	void addWord(Word word) {
		if(number < voc.length) {
			voc[number++] = word;
		}
		else System.out.println("단어장에 더이상 단어를 등록할 수 없습니다.");
	}
	
	void makeVoc(String fileName) {
		try(Scanner scan = new Scanner(new File(fileName))){
			while(scan.hasNextLine()) {
				String str = scan.nextLine();
				String[] temp = str.split("\t");
				this.addWord(new Word(temp[0].trim(),temp[1].trim()));
			}
			System.out.println("upload");
			this.menu();
		}catch(FileNotFoundException e) {
			System.out.println();
		}
	}
	public void searchVoc() {
		String sWord = scan.nextLine();
		sWord = sWord.trim();
		for (Word word : voc) {
			if(word != null) {
				if(word.eng.equals(sWord)) {
					System.out.println(word.kor);
					break;
				}
			}
			else{
				
				System.out.println("nop");
				break;
			}
		
		}
	}
	public void searchVoc2(){
		String sWord = scan.nextLine();
		sWord = sWord.trim();
		for (Word word : voc) {
			if(word != null) {
				if(word.eng.contains(sWord)) {
					System.out.println(word.kor);
					break;
				}
			}
		}
	}
	void menu() {
		int choice = 0;
		while(choice != 2) {
			System.out.println("1) 검색 2) 종료");
			choice = scan.nextInt();
			scan.nextLine();
			switch(choice) {
			case 1:
				searchVoc();
				break;
			case 2:
				break;
			}
		}
	}
}
