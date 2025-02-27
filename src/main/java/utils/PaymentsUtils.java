package utils;

import java.util.HashMap;
import java.util.Map;

import exception.InsufficientAmountException;

public class PaymentsUtils {
	
	private static Map<String, Double> paymentMap = new HashMap<>();
	
	{
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc2", 10000.0);
		paymentMap.put("acc3", 5000.0);
		paymentMap.put("acc4", 8000.0);
		
	}
	
	public static boolean validateCreditLimt(String accNo, double paidAmount) {
		if(paidAmount>paymentMap.get(accNo)) {
			throw new InsufficientAmountException("Insufficent Fund exception");
		}else {
			return true;
		}
	}

}
