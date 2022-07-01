package co.edu;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		
		System.out.println("값을 입력하세요.");
		Scanner sn = new Scanner(System.in);
		
//		String input = sn.nextLine();
//		System.out.printf("입력값은 %s", input);
//		int input = sn.nextInt();
//		System.out.printf("입력값은 %d", input);
		
		System.out.println("첫번째 값을 입력하세요.");
		int num1 = sn.nextInt();
		
		System.out.println("두번째 값을 입력하세요.");
		int num2 = sn.nextInt();
		
//		int result = num1 + num2;
		
		
		
		boolean comparison = num1 > num2;
		int theDifference = 0;
		
		if (comparison) {
			theDifference = num1 - num2;
		} else {
			theDifference = num2 - num1;
		}
		
		System.out.printf("입력값의 %d와 %d의 차이는 %d 입니다.", num1, num2, theDifference);
		
	}

}
