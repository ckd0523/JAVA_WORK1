package Problem.exam02;

public abstract class TaxPayer {
	
	protected String name;
	protected int number;
	
	public TaxPayer(String name, int number) {
		this.name=name;
		this.number=number;
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getNumber() {return number;}

	public void setNumber(int number) {this.number = number;}
	
	public abstract double Tax();
	
	public abstract String toString();
	
	

}
