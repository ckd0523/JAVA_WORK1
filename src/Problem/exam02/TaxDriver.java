package Problem.exam02;

public class TaxDriver {

	public static void main(String[] args) {

		SalaryTaxPayer payer1 = new SalaryTaxPayer("선남",100,3000000);
		System.out.println(payer1);
		
		BusinessTaxPayer payer2 = new BusinessTaxPayer("선녀",200,120000000,75000000);
		System.out.println(payer2);
		
	}

}
