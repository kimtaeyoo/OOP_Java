package team;

import java.util.Scanner;

public class Team1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int money = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.print("예금액> ");
				String Change = scanner.nextLine();
				money = money + Integer.parseInt(Change);
				
			} else if(strNum.equals("2")) {
				System.out.print("출금액> ");
				String Change = scanner.nextLine();
				if((money - Integer.parseInt(Change) < 0)){
					System.out.println("출금 할 돈이 부족합니다. ");
				} else {
				money = money - Integer.parseInt(Change);
				}
			} else if(strNum.equals("3")) {
				System.out.println("잔고> "+money);
			} else if(strNum.equals("4")) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
}
}