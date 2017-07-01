package Day12;

import java.util.Arrays;

public class Score {
	private  int score;

	public Score(int score) {
		super();
		this.score = score;
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [score=" + score + "]";
	}
	

}
