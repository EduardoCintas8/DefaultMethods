package services;

public class BrazilInterestService {

	private Double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;

	}

	public Double getInterestRate() {
		return this.interestRate;
	}

	public double payment(double amount, int months) {
		return amount * Math.pow(1 + interestRate / 100, months);
	}

	
	
}
