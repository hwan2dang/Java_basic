//launch4j = JVM이 없어도 다른 컴퓨터에서 자바프로그램이 실행될 수 있도록
//자바프로그램과 JVM을 묶어서 하나의 프로그램으로 만들어 준다.
//		double vat = getVAT();
//		double total = getTotal(vat);
//		double expence = getExpence(expenceRate);
//		double income = getIncome(expence);
		
//		double dividend1 = income * dividendRates[0];
//		double dividend2 = income * dividendRates[1];
//		double dividend3 = income * dividendRates[2];

		
		
		
//		double[] dividendRates = new double[3];
//		dividendRates[0] = 0.5;
//		dividendRates[1] = 0.3;
//		dividendRates[2] = 0.2;
		
		
//		int i = 0;
//		while(i < dividendRates.length) {
//			System.out.println("Dividend : " + income * dividendRates[i]);
//			i += 1;
//		}
class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenceRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpence());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend1 : " + getDividend1());
		System.out.println("Dividend2 : " + getDividend2());
		System.out.println("Dividend3 : " + getDividend3());
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	
	public double getIncome() {
		return valueOfSupply - expenceRate;
	}

	public double getExpence() {
		return valueOfSupply * expenceRate;
	}

	public double getTotal() {
		return valueOfSupply + getVAT();
	}

	public double getVAT() {
		return valueOfSupply * vatRate;
	}
}


public class AccountingApp {
	
	public static void main(String[] args) {
		
//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenceRate = 0.3;
//		Accounting.print();
		
		Accounting a1 = new Accounting(); //instance
		a1.valueOfSupply = 20000.0;
		a1.vatRate = 0.1;
		a1.expenceRate = 0.3;
		a1.print();
		
	}
	
}