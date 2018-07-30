package code;

import java.io.*;
import java.util.*;

public class TxtRead {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedWriter bwst = null;
		BufferedReader brstu = null;
		BufferedWriter bwoutput = null;
		List<Student> studentList = new LinkedList<Student>();
		try {
			File scoreTableF = new File("data/scoreTable.txt");
			File studentF = new File("data/student.txt");
			File output = new File("data/output.txt");
			bwst = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(scoreTableF, true)));
			brstu = new BufferedReader(new InputStreamReader(new FileInputStream(studentF)));
			bwoutput = new BufferedWriter(new FileWriter(output));
			String s = null;
			Random ywRandom = new Random();
			Random yyRandom = new Random();
			Random sxRandom = new Random();

			while ((s = brstu.readLine()) != null) {
				String name = s;
				int chinese = ywRandom.nextInt(51) + 50;
				int math = yyRandom.nextInt(51) + 50;
				int english = sxRandom.nextInt(51) + 50;
				int score = chinese + math + english;
				studentList.add(new Student(name, chinese, math, english, score));
			}
			for (Student student : studentList) {
				bwst.write(student.toString());
			}
			Collections.sort(studentList);
			for (Student student : studentList) {
				bwoutput.write(student.toString());
			}
		} finally {
			if (bwst != null)
				bwst.close();
			if (brstu != null)
				brstu.close();
			if (bwoutput != null)
				bwoutput.close();
		}
	}

}
