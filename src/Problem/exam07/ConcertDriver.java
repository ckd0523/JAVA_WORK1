//package Problem.exam07;
//
//import java.util.Scanner;
//
//public class ConcertDriver {
//
//	public static void main(String[] args) {
//
//		Concert singer1 = new Concert("가수왕", 100, 10000, 20000);
//		
//		System.out.println("콘서트 판매 프로그램을 시작합니다.");
//		Scanner scan = new Scanner(System.in);
//		boolean done = false;
//		
//		while(!done) {
//			if(singer1.webSalesOnly()) {
//				System.out.println("\n 인터넷 판매이면 S, 현장판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요.");
//			}
//			else {System.out.println("\n현장 판매이면 S, 판매를 종료하려면 F를 입력하세요 : ");
//		}
//		String response = scan.next();
//		
//		if(response.equals("S")) {
//			singer1.doTicketSale();
//		}
//		else if(response.equals("V")) {
//			System.out.println("남은 티켓수 : "+singer1.getTicketsLeft()); 
//		}
//		else if(response.equals("F")) {
//			done=true;
//			singer1.webSalesOver();
//			break;
//		}
//		else if
//		
//	}
//
//}
