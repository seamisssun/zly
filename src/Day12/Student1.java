package Day12;

import java.util.Arrays;

public class Student1 {
	

	private Score []scores;

	public Student1(Score[] scores) {
		super();
		this.scores = scores;
	}

	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Score[] getScores() {
		return scores;
	}

	public void setScores(Score[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student1 [scores=" + Arrays.toString(scores) + "]";
	}
	

}
