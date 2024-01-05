package ch06check20;

import java.util.*;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;

		while (run) {
			System.out.println("----------------------------------------");
			System.out.println(" 1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료 ");
			System.out.println("----------------------------------------");
			System.out.print("선택 : ");
			int selectNo = Integer.parseInt(input.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	private static void createAccount() {
		
		System.out.println("-------");
		System.out.println(" 계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌번호 : ");
		String ano = input.nextLine();
		System.out.print("예금주 : ");
		String owner = input.nextLine();
		System.out.print("초기 입금액 : ");
		int balance = Integer.parseInt(input.nextLine());
		
		Account newAccount = new Account(ano,owner,balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i]=newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	

	}

	private static void accountList() {
		System.out.println("-------");
		System.out.println(" 계좌목록");
		System.out.println("-------");
		
		for(int j=0; j<accountArray.length; j++) {
			if(accountArray[j]!=null) {
			System.out.println(accountArray[j].getAno()+", "+accountArray[j].getOwner()+", "+accountArray[j].getBalance());
			}
		}
		
	}

	private static void deposit() {
		System.out.println("----");
		System.out.println(" 예금 ");
		System.out.println("----");
		
		System.out.print("계좌번호 : ");
		String ano = input.nextLine();
		
		for(int i=0; i<accountArray.length; i++) {
			
			if(accountArray[i].getAno().equals(ano)) {
				System.out.print("예금액 : ");
				int add = Integer.parseInt(input.nextLine());
				accountArray[i].setBalance(accountArray[i].getBalance()+add );
				System.out.println("현재 금액 : "+accountArray[i].getBalance());
				break;
				
				
		}
		
	
		
	}
	}

	private static void withdraw() {
		System.out.println("----");
		System.out.println(" 출금 ");
		System.out.println("----");
		
		System.out.print("계좌번호 : ");
		String ano = input.nextLine();
		
		for(int i=0; i<accountArray.length; i++) {
			
			if(accountArray[i].getAno().equals(ano)) {
				System.out.print("출금액 : ");
				int minus = Integer.parseInt(input.nextLine());
				
				if(minus<=accountArray[i].getBalance()) {
				
				accountArray[i].setBalance(accountArray[i].getBalance()-minus );
				System.out.println("현재 금액 : "+accountArray[i].getBalance());
				break;
				}
				else {
					System.out.println("출금액이 부족합니다.");
					break;
				}
				
		}
		
		
		
	}
	}

}
