package quiz2;

import java.util.Scanner;

public class Quiz2Question1 {

	private double carCost;
	private double downPay;
	private double loanLenMonths;
	private double intRate;
	
	public static void main(String[] args) {
		Scanner statsIn = new Scanner(System.in);
		Quiz2Question1 statStore = new Quiz2Question1();
		System.out.println("To calculate your monthly payment and interest payment, enter the following statistics in order, one at a time: Total Car Cost, Down Payment, Term of the loan in Months, and the total Interest Rate.");
		statStore.carCost = statsIn.nextDouble();
		statStore.downPay = statsIn.nextDouble();
		statStore.loanLenMonths = statsIn.nextDouble();
		statStore.intRate = statsIn.nextDouble();
		statsIn.close();
		System.out.print("Monthly payment (no rounding): " + statStore.carPaymentPerMonth() + ", Total Interest (no rounding): " + statStore.totalInt());

	}

	public Quiz2Question1() {

	}
	
	public void setVars(double a, double b, double c, double d) {
		this.carCost = a;
		this.downPay = b;
		this.loanLenMonths = c;
		this.intRate = d;
	}
	
	public double carPaymentPerMonth() {
		double monthlyInt = intRate/(100*12);
		return (carCost-downPay)*((monthlyInt*Math.pow(1+monthlyInt, loanLenMonths))/(Math.pow(1+monthlyInt, loanLenMonths)-1));
	}
	
	public double totalInt() {
		return -1*((carCost-downPay) - (this.carPaymentPerMonth() * loanLenMonths));
	}
}
