package dto;

import entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
	
	public FlightBookingAcknowledgement(String string, double fare, String string2) {
		// TODO Auto-generated constructor stub
	}
	private String status;
	private double totalFare;
	private String pnrNo;
	private PassengerInfo passengerInfo;
	
	

}
