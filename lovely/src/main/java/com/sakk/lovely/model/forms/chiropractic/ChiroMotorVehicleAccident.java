package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.DriverPassenger;
import com.sakk.lovely.model.VehicleCollisionPart;

/**
 * PAST MOTOR VEHICLE ACCIDENT
 */

public class ChiroMotorVehicleAccident extends BaseEntity {

	@Id
	@Column(name = "MOTORVEHICLEACCIDENT_ID", unique = true, nullable = false)
	private Integer chiroExperienceId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_MOTORVEHICLEACCIDENT", joinColumns = { @JoinColumn(name = "MOTORVEHICLE_ACCIDENT_ID", referencedColumnName = "MOTORVEHICLEACCIDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;

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

}
