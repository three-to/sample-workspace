package co.edu;

public class Variable {

	public static void main(String[] args) {
		byte b1 = 10;  // -128 < byte < 127
		short s1 = 0;  // -32768 < short < 32767
		int n1 = 0;  // -2,147,483,648 < int < 2,147,483,647
		long l1 = 8L;  // -9,223,372,036,854,775,808 < long < 9,223,372,036,854,775,807
		
		
		int result = b1 + 20; // (int) bi + 20
		long result1 = l1 + 20;  // 데이터타입 변환 : 자동형변환(promotion)
		result = (int) l1 + 20;  // 데이터타입 변환 : 강제형변환(casting)
//		System.out.println(result);
		

		char c1 = 'A';
		
//		이력 변경 추가(2022.07.01 12:55)
		System.out.println("이력변경추가");
//              깃에서 변경
		int a =0;
	}

}
