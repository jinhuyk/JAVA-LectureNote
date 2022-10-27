package greenjoa.week09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileMerge("words1.txt","words2.txt","words.txt");
		
	}

	public static void fileMerge(String filename1, String filename2, String filename3) {

		try (
				Scanner file1 = new Scanner(new File(filename1));
				Scanner file2 = new Scanner(new File(filename2));
				PrintWriter outfile = new PrintWriter(new File(filename3));){
			
			fileWriter(file1,outfile);
			fileWriter(file2,outfile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}//finally {
		//	if(file1!=null) file1.close();
		//	if(file2 != null) file2.close();
		//	if(outfile != null) outfile.close();
		//}
		
		
	}

	public static void fileWriter(Scanner file, PrintWriter outfile) {
		while(file.hasNextLine()) {
			String str = file.nextLine();
			outfile.println(str);
		}
		
	}

}
