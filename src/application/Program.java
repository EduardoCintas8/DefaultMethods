package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantity: ");
		double quantity = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		BrazilInterestService br = new BrazilInterestService(2.0);
		
		double totalValue = br.payment(quantity, months);
		
		System.out.println("Payments after " + months + " months:");
		System.out.println("R$: " + String.format("%.2f", totalValue) );

		sc.close();
	}

}
