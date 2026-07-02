package Java8;

public class Main {
	public static void main(String[] args) {
//		TaxCalculator tax = new TaxCalculator() {
//			public double calculateTax(double salary) {
//				double result = salary * 0.35;
//				return result;
//			}
//		};
//		
//		System.out.println("Tax result : " + tax.calculateTax(46000.0)); //Tax result : 16099.999999999998
//		
		TaxCalculator tax = salary -> salary * 0.35;
		
		System.out.println("Tax result from lambda : "+ tax.calculateTax(46000.0));
		
	}
}
