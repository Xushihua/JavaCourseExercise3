package code;

public class Student implements Comparable<Student> {

	private String name;
	private int chinese;
	private int math;
	private int english;
	private int score;

	public Student(String name, int chinese, int math, int english, int score) {
		this.name = name;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.score = score;

	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		String studentString = name + "\t" + chinese + "\t" + math + "\t" + english + "\t" + score+System.lineSeparator();
		return studentString;
	}

	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if (this.score < student.score)
			return -1;
		else if (this.score == student.score)
			return 0;
		else
			return 1;
	}

}
