package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.DriverPassenger;
import com.sakk.lovely.model.VehicleCollisionPart;

/**
 * PAST MOTOR VEHICLE ACCIDENT
 */

public class ChiroMotorVehicleAccident extends BaseEntity {

	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroMotorVehicleAccident.class);
	
	@Column(name = "MOTORVEHICLEACCIDENT_ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer chiroExperienceId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_MOTORVEHICLEACCIDENT", joinColumns = { @JoinColumn(name = "MOTORVEHICLE_ACCIDENT_ID", referencedColumnName = "MOTORVEHICLEACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "MOTORVEHICLEACCIDENT_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	@Column(name = "MOTOR_VEHICLE_ACCIDENT")
	private boolean motorVehicleAccident;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	private Date date;

	@Enumerated(EnumType.STRING)
	@Column(name = "DRIVER_PASSENGER")
	private DriverPassenger driverOrPassenger;

	@Type(type = "yes_no")
	@Column(name = "WEARING_SEATBELT")
	private boolean wearingSeatBelt;

	@Enumerated(EnumType.STRING)
	@Column(name = "VEHICLE_COLLISION")
	private VehicleCollisionPart vehicleCollisionPart;

	@Type(type = "yes_no")
	@Column(name = "STRIKE_HEAD")
	private boolean strikeHead;

	@Type(type = "yes_no")
	@Column(name = "LOSSCONCIOUSNESS")
	private boolean lossConsciousness;

	@Type(type = "yes_no")
	@Column(name = "SENT_TO_HOSPITAL")
	private boolean sentToHospital;

	@Type(type = "yes_no")
	@Column(name = "X-RAY_TAKEN")
	private boolean xrayTaken;

	@Type(type = "yes_no")
	@Column(name = "MEDICATION_GIVEN")
	private boolean medicationGiven;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careGivenType;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "INJURIES_SUSTAINED")
	private String injuriesSustained;

	@Type(type = "yes_no")
	@Column(name = "INJURIES_RESOLVED")
	private boolean injuriesResolved;

	public Integer getChiroExperienceId() {
		return chiroExperienceId;
	}

	public void setChiroExperienceId(Integer chiroExperienceId) {
		this.chiroExperienceId = chiroExperienceId;
	}

	public ChiroPatient getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatient patientInfo) {
		this.patientInfo = patientInfo;
	}

	public boolean isMotorVehicleAccident() {
		return motorVehicleAccident;
	}

	public void setMotorVehicleAccident(boolean motorVehicleAccident) {
		this.motorVehicleAccident = motorVehicleAccident;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DriverPassenger getDriverOrPassenger() {
		return driverOrPassenger;
	}

	public void setDriverOrPassenger(DriverPassenger driverOrPassenger) {
		this.driverOrPassenger = driverOrPassenger;
	}

	public boolean isWearingSeatBelt() {
		return wearingSeatBelt;
	}

	public void setWearingSeatBelt(boolean wearingSeatBelt) {
		this.wearingSeatBelt = wearingSeatBelt;
	}

	public VehicleCollisionPart getVehicleCollisionPart() {
		return vehicleCollisionPart;
	}

	public void setVehicleCollisionPart(
			VehicleCollisionPart vehicleCollisionPart) {
		this.vehicleCollisionPart = vehicleCollisionPart;
	}

	public boolean isStrikeHead() {
		return strikeHead;
	}

	public void setStrikeHead(boolean strikeHead) {
		this.strikeHead = strikeHead;
	}

	public boolean isLossConsciousness() {
		return lossConsciousness;
	}

	public void setLossConsciousness(boolean lossConsciousness) {
		this.lossConsciousness = lossConsciousness;
	}

	public boolean isSentToHospital() {
		return sentToHospital;
	}

	public void setSentToHospital(boolean sentToHospital) {
		this.sentToHospital = sentToHospital;
	}

	public boolean isXrayTaken() {
		return xrayTaken;
	}

	public void setXrayTaken(boolean xrayTaken) {
		this.xrayTaken = xrayTaken;
	}

	public boolean isMedicationGiven() {
		return medicationGiven;
	}

	public void setMedicationGiven(boolean medicationGiven) {
		this.medicationGiven = medicationGiven;
	}

	public String getCareGivenType() {
		return careGivenType;
	}

	public void setCareGivenType(String careGivenType) {
		this.careGivenType = careGivenType;
	}

	public String getCareGivenBy() {
		return careGivenBy;
	}

	public void setCareGivenBy(String careGivenBy) {
		this.careGivenBy = careGivenBy;
	}

	public String getInjuriesSustained() {
		return injuriesSustained;
	}

	public void setInjuriesSustained(String injuriesSustained) {
		this.injuriesSustained = injuriesSustained;
	}

	public boolean isInjuriesResolved() {
		return injuriesResolved;
	}

	public void setInjuriesResolved(boolean injuriesResolved) {
		this.injuriesResolved = injuriesResolved;
	}

}
