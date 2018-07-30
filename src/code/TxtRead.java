package code;

import java.io.*;
import java.util.*;
public class TxtRead {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedWriter bwst = null;
		BufferedReader brstu = null;
		try {
			File scoreTable = new File("data/scoreTable.txt");
			File student = new File("data/student.txt");
			bwst = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(scoreTable,true)));
			brstu = new BufferedReader(new InputStreamReader(new FileInputStream(student)));
			String s = null;
			Random ywRandom=new Random();
			Random yyRandom=new Random();
			Random sxRandom=new Random();
			
			while ((s = brstu.readLine()) != null) {
				s+="\t";
				s+=ywRandom.nextInt(51)+50;
				s+="\t";
				s+=yyRandom.nextInt(51)+50;
				s+="\t";
				s+=sxRandom.nextInt(51)+50;
				s += System.lineSeparator();
				
				bwst.write(s);
			}
		} finally {
			if (bwst != null)
				bwst.close();
			if (brstu != null)
				brstu.close();

		}
	}

}
