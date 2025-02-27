package services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import dto.FlightBookingAcknowledgement;
import dto.FlightBookingRequest;
import entity.PassengerInfo;
import entity.PaymentInfo;
import repository.PassengerInfoRepo;
import repository.PaymentInfoRepo;
import utils.PaymentsUtils;

public class FlightBookingService {
	
	@Autowired
	private PassengerInfoRepo passengerInfoRepo;
	
	@Autowired
	private PaymentInfoRepo paymentInfoRepo;

	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		
		FlightBookingAcknowledgement acknowledgement = null;
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfo = passengerInfoRepo.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		
		PaymentsUtils.validateCreditLimt(paymentInfo.getAccountNo(), passengerInfo.getFare());
	
		paymentInfo.setPassengerId(passengerInfo.getpId());
		
		paymentInfo.setAmount(passengerInfo.getFare());
	
		paymentInfoRepo.save(paymentInfo);
		return new FlightBookingAcknowledgement("success",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0]);
		
	}
}
