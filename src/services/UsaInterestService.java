package services;

public class UsaInterestService implements InterestService {

	private Double interestRate;

	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return this.interestRate;
	}

	
	
	
}
