package application;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Quantity: ");
			double quantity = sc.nextDouble();
			System.out.print("Months: ");
			int months = sc.nextInt();

			
			InterestService br = new UsaInterestService(1.0);
			

			double totalValue = br.payment(quantity, months);

			System.out.println("Payments after " + months + " months:");
			System.out.println("R$: " + String.format("%.2f", totalValue));
		} catch (InvalidParameterException e) {
			System.out.println("Error..." + e.getMessage());
		}
		sc.close();
	}
}
