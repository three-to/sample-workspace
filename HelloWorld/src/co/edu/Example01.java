package co.edu;

public class Example01 {

	public static void main(String[] args) {
		String name = "전성하";
		int kor = 99;
		int eng = 87;
		int math = 68;
		
		int sum = kor + eng + math;
		double average = sum / 3d;
		
		System.out.println("======================================");
		System.out.println("< " + name + "학생의 과목별 점수 >");
		System.out.println("국어: " + kor + "점, 영어: " + eng + "점, 수학: " + math + "점");
		System.out.println();
		System.out.println(name + " 학생의 총점: " + sum + "점");
		System.out.println(name + " 학생의 평균점수: " + average + "점");
		System.out.println("======================================");
	}

}
