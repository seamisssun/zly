package Day12;

public class Student {
	private int id;
	private String name;
	private int score;

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student(int id, String name, int score) {

		this.setId(id);
		this.setName(name);
		this.setScore(score);
	}

	public static void main(String[] args) {
		Student[] student = new Student[3];

		student[0] = new Student(1, " Ð¡Ã÷      ", 80);
		student[1] = new Student(2, " ÀîÀ×      ", 75);
		student[2] = new Student(3, " º«Ã·Ã·  ", 90);
		print(student);
		// Student[] student = null;

	}

	public static void print(Student[] arr) {
		System.out.println("Id name score");
	for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getId() + " " + arr[i].getName() + " "
					+ arr[i].getScore());
		}
	}
}
