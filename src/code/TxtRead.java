package code;
import java.io.*;
public class TxtRead {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
		File scoreTable=new File("data/scoreTable.txt");
		File student=new File("data/student.txt");
		BufferedReader brstu=new BufferedReader(new FileReader(scoreTable));
		BufferedWriter bwst=new BufferedWriter(new FileWriter(student));
		String s=null;
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
