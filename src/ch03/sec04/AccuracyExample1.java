package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result1 = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: "+result1);
		
		int piece = 10; //1개의 사과를 10개로 표현
		int remainPiece = piece - number; //1개의 사과를 0.1로 7번 먹은것을 int로 연산
		double result2 = (double)remainPiece/piece; //강제 형변환으로 연산해 소수표현
		System.out.println("10조각에서 남은 조각: "+remainPiece);
		System.out.println("사과 1개에서 남은 양: "+result2);
	}

}
