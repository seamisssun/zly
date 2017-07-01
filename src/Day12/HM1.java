package Day12;

import java.util.*;

public class HM1 {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {}

		// TODO Auto-generated method stub
		public static void init(Student1[] students){
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < students.length; i++) {
				Score[] scores = new Score[2];
				System.out.println("�������" + (i + 1) + "��ѧ���ĵ�" + scores.length + "�ųɼ�");
				for (int j = 0; j < scores.length; j++) {

					int score = sc.nextInt();
					scores[j] = new Score(score);
				}
				students[i] = new Student1(scores);
			}
		}

		public static void print (Student1 []students){
			System.out.println("���"+"\t"+"�γ�1"+"\t"+"�γ�2"+"\t"+"ƽ����");
			for(int i=0;i<students.length;i++){
				double sum=0;
				System.out.println((i+1)+"\t");
				Score []scores=students[i].getScores();
				for(int j=0;j<scores.length;j++){
					int Score=scores[j].getScore();
					sum+=Score;
					System.out.println(Score+" ");
				}
				System.out.println(sum/scores.length);
			}
			}
	//	System.out.println("------------------------------");
		
	}
	


