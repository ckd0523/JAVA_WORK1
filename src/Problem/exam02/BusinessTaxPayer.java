package Problem.exam02;

public class BusinessTaxPayer extends TaxPayer {

	private int sales;
	private int expenses;
	
	public BusinessTaxPayer(String name, int number, int sales, int expenses) {
		super(name, number);
		this.sales=sales;
		this.expenses=expenses;
	}

	public int getSales() {return sales;}
	public void setSales(int sales) {this.sales = sales;}
	public int getExpenses() {return expenses;}
	public void setExpenses(int expenses) {this.expenses = expenses;	}

	

	@Override
	public double Tax() {
		if((sales-expenses)>=40000000)return (sales-expenses)*0.2;
		else if((sales-expenses)>0)return (sales-expenses)*0.1;
		else return 0;
	}
	
	public String toString() {
		return "이름 : "+name+", 번호 : "+number+", 총매출액 : "+sales+"원, 총비용 : "+expenses+"원, 과세대상금액 : "+(sales-expenses)+"원, 세금 : "+(int)Tax()+"원";
	}
	
	

}
