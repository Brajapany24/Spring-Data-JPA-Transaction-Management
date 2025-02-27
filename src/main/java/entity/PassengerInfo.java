package entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER_INFO")
public class PassengerInfo {
	
	@Id
	@GeneratedValue
	private Long pId;
	private String name;
	private String email;
	private String source;
	private String Desitination;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-mm-yyyy")
	private Date travelDate;
	private String pickupTime;
	private String arrivalTime;
	private double fare;
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDesitination() {
		return Desitination;
	}
	public void setDesitination(String desitination) {
		Desitination = desitination;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "PassengerInfo [pId=" + pId + ", name=" + name + ", email=" + email + ", source=" + source
				+ ", Desitination=" + Desitination + ", travelDate=" + travelDate + ", pickupTime=" + pickupTime
				+ ", arrivalTime=" + arrivalTime + ", fare=" + fare + "]";
	}
	
	

}
