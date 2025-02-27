package dto;

import entity.PassengerInfo;
import entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import repository.PaymentInfoRepo;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	private PaymentInfoRepo paymentInfoRepo;
	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}
	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}
	public PaymentInfoRepo getPaymentInfoRepo() {
		return paymentInfoRepo;
	}
	public void setPaymentInfoRepo(PaymentInfoRepo paymentInfoRepo) {
		this.paymentInfoRepo = paymentInfoRepo;
	}
	public PaymentInfo getPaymentInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
