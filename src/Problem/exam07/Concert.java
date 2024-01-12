//package Problem.exam07;
//
//import java.util.Scanner;
//
//public class Concert {
//	
//	private String singerName;		// 가수의 이름
//	private int capacity;				// 수용 인원
//	private int ticketsSold=0;		// 팔린 티켓수
//	int offTicketPrice;					// 현장 티켓 가격
//	int onTicketPrice;					// 인터넷 티켓 가격
//	int totalPrice=0;						// 총 가격
//	boolean Arrow;						// 인터넷 판매 가능 여부
//	int toSell=0;
//	
//	
//	
//	public Concert() {}
//	
//	public Concert(String name,int max, int costOverWeb, int costAtVenue) {
//		singerName=name;
//		capacity=max;
//		offTicketPrice=costAtVenue;
//		onTicketPrice=costOverWeb;
//	}
//	
//	public void doTicketSale() {
//		System.out.println("남은 티켓들 수는 (최대 "+getTicketsLeft()+") 입니다.");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("몇장을 사시겠습니까?");
//		toSell = scan.nextInt();
//		
//		boolean saleCompleted = sellTickets(toSell);
//		
//		if(getTicketsLeft()<=0) {
//			System.out.println("판매가 불가합니다.");
//		}
//		
//	}
//	
//    // 구매 요청한 수만큼 티켓을 판다
//    // 티켓을 판매할 수 있으면 판매 기록을 갱신하고 true를 반환한다
//    // 티켓을 판매할 수 없으면 false를 반환한다
//	public boolean sellTickets(int number) {
//		
//		if(getTicketsLeft()>0) { 
//			ticketsSold+=number;
//			return true;
//			}
//		else return false;
//		
//	}
//	
//	// 구매 요청한 인터넷 티켓들의 가격을 계산한 후 반환한다
//	public int getSaleOnCost() {
//		return toSell*onTicketPrice;
//	}
//	
//	public int getSaleOffCost() {
//		return toSell*offTicketPrice;
//	}
//	
//	
//    // 인터넷 판매를 종료한다
//	public void webSalesOver() {
//			System.out.println("판매를 종료합니다.");
//	}
//	
//	 // 팔린 티켓들의 수를 알려 준다
//	public int getTicketsSold() {
//	return ticketsSold;	
//	}
//	
//	// 남은 티켓들의 수를 알려 준다
//	public int getTicketsLeft() {
//		return (capacity-ticketsSold);
//	}
//	
//	// 총 판매 금액을 알려 준다
//	public int getTotalSales() {
//		return getSaleOffCost(toSell)+getSaleOnCost(toSell);
//	}
//	
//	// 인터넷 판매 가능 여부를 알려 준다
//	public boolean webSalesOnly() {
//		if(getTicketsLeft()>0) return true;
//		else return false;
//	}
//	
//	// 팔린 티켓 수와 총 판매 금액을 반환한다
//	public String getSalesReport() {
//		return "팔린 티켓수 : "+ticketsSold+"총 판매 금액 :"+getTotalSales();
//	}
//	
//	
//	
//
//}
