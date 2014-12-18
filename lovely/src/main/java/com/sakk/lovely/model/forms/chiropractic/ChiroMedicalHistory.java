package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.Pregnancy;

/**
 * MEDICAL HISTORY
 */

public class ChiroMedicalHistory extends BaseEntity {

	@Column(name = "FAMILY_DOCTOR_NAME")
	private String familyDoctorName;

	@Column(name = "FAMILY_DOCTOR_PHONE")
	private String familyDoctorPhone;

	@Column(name = "FAMILY_DOCTOR_ADDRESS")
	private String familyDoctoryAddress;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastFullCheckUp;

	@Type(type = "yes_no")
	private boolean onMedication;

	@Column(name = "MEDICATION_TYPE1")
	private String medicationType1;

	@Column(name = "MEDICATION_TYPE1FOR")
	private String medicationType1For;

	@Column(name = "MEDICATION_TYPE1DOSE")
	private String medicationType1Dose;

	@Column(name = "MEDICATION_TYPE1FREQUENCY")
	private String medicationType1Frequency;

	@Column(name = "MEDICATION_TYPE2")
	private String medicationType2;

	@Column(name = "MEDICATION_TYPE2FOR")
	private String medicationType2For;

	@Column(name = "MEDICATION_TYPE2DOSE")
	private String medicationType2Dose;

	@Column(name = "MEDICATION_TYPE2FREQUENCY")
	private String medicationType2Frequency;

	@Column(name = "SURGERY1")
	private String surgery1;

	@Temporal(TemporalType.TIMESTAMP)
	private Date surgery1Date;

	@Type(type = "yes_no")
	private boolean surgery1Complications;

	@Column(name = "SURGERY2")
	private String surgery2;

	@Temporal(TemporalType.TIMESTAMP)
	private Date surgery2Date;

	@Type(type = "yes_no")
	private boolean surgery2Complications;

	@Type(type = "yes_no")
	private boolean vision;

	@Type(type = "yes_no")
	private boolean hearing;

	@Type(type = "yes_no")
	private boolean smell;

	@Type(type = "yes_no")
	private boolean taste;

	@Type(type = "yes_no")
	private boolean dizziness;

	@Type(type = "yes_no")
	private boolean headaches;

	@Type(type = "yes_no")
	private boolean difficultySwallowing;

	@Type(type = "yes_no")
	private boolean lossOfBalance;

	@Type(type = "yes_no")
	private boolean nightSweats;

	@Type(type = "yes_no")
	private boolean diabetes;

	@Type(type = "yes_no")
	private boolean stroke;

	@Type(type = "yes_no")
	private boolean aneurysm;

	@Type(type = "yes_no")
	private boolean heartContition;

	@Type(type = "yes_no")
	private boolean osteoprosis;

	@Type(type = "yes_no")
	private boolean arthritis;

	@Type(type = "yes_no")
	private boolean prostateDisorder;

	@Type(type = "yes_no")
	private boolean menstrualProblems;

	@Type(type = "yes_no")
	private boolean hepatitis;

	@Type(type = "yes_no")
	private boolean hivInfected;

	@Type(type = "yes_no")
	private boolean shortnessOfBreath;

	@Type(type = "yes_no")
	private boolean cancer;

	@Type(type = "yes_no")
	private boolean std;

	@Type(type = "yes_no")
	private boolean tuberculosis;

	@Type(type = "yes_no")
	private boolean chestPain;

	@Type(type = "yes_no")
	private boolean highBloodPressure;

	@Type(type = "yes_no")
	private boolean digestiveProblems;

	@Type(type = "yes_no")
	private boolean bowlProblems;

	@Type(type = "yes_no")
	private boolean bladderProblems;

	@Type(type = "yes_no")
	private boolean significantWeightLoss;

	@Type(type = "yes_no")
	private boolean pinsAndNeedlesInArm;

	@Type(type = "yes_no")
	private boolean numbnessInFingers;

	@Type(type = "yes_no")
	private boolean weaknessInFingers;

	@Type(type = "yes_no")
	private boolean numblessInLegs;

	@Type(type = "yes_no")
	private boolean weaknessInLegs;

	@Type(type = "yes_no")
	private boolean backPain;

	@Type(type = "yes_no")
	private boolean neckPain;

	@Type(type = "yes_no")
	private boolean tmjDisorder;

	@Type(type = "yes_no")
	private boolean earRinging;

	@Type(type = "yes_no")
	private boolean other;

	@Column(name = "OTHER_DESCRIPTION")
	private String otherDescription;

	@Enumerated(EnumType.STRING)
	private Pregnancy pregnancy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastMenstrualPeriod;

	@Type(type = "yes_no")
	private boolean chiropractorToContactMedicalDoctor;

}
