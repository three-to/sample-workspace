package co.edu;

import java.io.IOException;

public class Example04 {

	public static void main(String[] args) {
		System.out.print("값을 입력하세요.");
		boolean run = true;
		
		while (run) {
			int result = 0;
		
			try {
				result = System.in.read();
				System.out.printf("입력값은 %d 입니다.", result);
			} catch (IOException e) {
				e.printStackTrace();
			}
			run = result != 48;
		}
		
	}

}
