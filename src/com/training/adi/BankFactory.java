package com.training.adi;

public class BankFactory {
	
	public static Bank getBank(String bankName) {
		if(bankName.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		else if(bankName.equalsIgnoreCase("PNB")) {
			return new PNB();
		}
		else {
			return null;
		}
	}

}
