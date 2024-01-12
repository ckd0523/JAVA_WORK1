package Problem.exam02;

public class SalaryTaxPayer extends TaxPayer {

	private int salary;
	
	public SalaryTaxPayer(String name, int number,int salary) {
		super(name, number);
		this.salary=salary;
	}
	
	@Override
	public double Tax() {
		if(salary*12>80000000)return salary*12*0.3;
		else if(salary*12>60000000)return salary*12*0.2;
		else if(salary*12>40000000)return salary*12*0.15;
		else if(salary*12>20000000)return salary*12*0.1;
		else return salary*12*0.05;
	}
	
	public String toString() {
		return "이름 : "+name+", 번호 : "+number+", 월급 : "+salary+"원, 세금 : "+(int)Tax()+"원";
		}
	
}
