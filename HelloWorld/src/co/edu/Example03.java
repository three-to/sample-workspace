package co.edu;

public class Example03 {

	public static void main(String[] args) {
		System.out.println(10 + 20);
		System.out.println("10" + "20");
		
		System.out.println("내 이름은 \'홍길동\' 입니다.");
		System.out.println("{\"name\":\"홍길동\", \"age\":20}");
		
		int num = Integer.parseInt("100");
		double num2 = Double.parseDouble("127.99");
		double num3 = Double.parseDouble("122.01");
		
		double result = sum(num, num2);
		result = minus(num2, num3);
		System.out.println("합결과: " + result);
		System.out.printf("차이는 %.2f 입니다.\n", result);
		
//		System.out.printf("저의 이름은 %s이고 나이는 %d 입니다.", "홍길동", 14);
		
		
		
		String name = "홍길동";
		int age = 16;
		double height = 65.4;
		
		System.out.printf("나의 이름은 %s이고 \n나이는 %d이고 \n몸무게는 %.1f 입니다.", name, age, height);
	}
	
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static double sum(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double minus(double n1, double n2) {
		double sum = n1 - n2;
		return sum;
	}
}
