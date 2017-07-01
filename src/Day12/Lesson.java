package Day12;

public class Lesson {

	/**
	 * @param args
	 */
	double course1;
	double course2;
	double courseavg;
	int ID;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getCourse1() {
		return course1;
	}

	public void setCourse1(double course1) {
		this.course1 = course1;
	}

	public double getCourse2() {
		return course2;
	}

	public void setCourse2(double course2) {
		this.course2 = course2;
	}

	public double getCourseavg() {
		return courseavg;
	}

	public void setCourseavg(double courseavg) {
		this.courseavg = courseavg;
	}

	public Lesson(int Id, double course1, double course2) {
		this.setID(Id);
		this.setCourse1(course1);
		this.setCourse2(course2);
		this.setCourseavg((course1 + course2) / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lesson[] lessons = new Lesson[3];
		lessons[0] = new Lesson(1, 55.0, 66.0);
		lessons[1] = new Lesson(2, 66.0, 77.0);
		lessons[2] = new Lesson(3, 77.0, 88.0);
		print(lessons);

	}

	private static void print(Lesson[] lessons) {
		// TODO Auto-generated method stub
		System.out.println("序号 课程1 课程2 平均分");
		for (int i = 0; i < lessons.length; i++) {
			System.out.println(lessons[i].getID() + " "
					+ lessons[i].getCourse1() + " " + lessons[i].getCourse2()
					+ " " + lessons[i].getCourseavg());
		}
		System.out
				.println("----------------------------------------");

		System.out
				.println("平均 "
						+ (lessons[0].getCourse1() + lessons[1].getCourse1() + lessons[2]
								.getCourse1())
						/ 3
						+ " "
						+ (lessons[0].getCourse2() + lessons[1].getCourse2() + lessons[2]
								.getCourse2()) / 3);

	}

}
