package co.edu;

public class Example02 {

	public static void main(String[] args) {
		double myHeight = 172.9;
		double yourHeight = 187.8;
		
		boolean isTure = myHeight > yourHeight;
		double theDifference = 0;
		
		if (isTure) {
			theDifference = myHeight - yourHeight;
			System.out.println("내 키가 " + theDifference + "만큼 더 큽니다.");
		} else {
			theDifference = yourHeight - myHeight;
			System.out.println("친구 키가 " + theDifference + "만큼 더 큽니다.");			
		}

	}

}
