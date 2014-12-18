package com.sakk.lovely.model.forms;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.forms.chiropractic.ChiropracticForm;

@Entity
@Table(name = "ChiropracticNewPatient")
public class ChiropracticNewPatient extends BaseEntity implements
		ChiropracticForm, Serializable {

	private static final long serialVersionUID = 1L;
	static Logger logger = LoggerFactory
			.getLogger(ChiropracticNewPatient.class);

	private static enum TITLE {
		MR, MRS, MISS, MS, DR
	}

	private String firstName;

	private String lastName;

	private Date dateOfBirth;

	private String address;

	private String homePhone;

	private String workPhone;

	private String cellPhone;

	private String Occupation;

	private String employer;

	private String email;

	private String hearAboutUs;

	private String emergencyContact;

	private String emergencyContactPhone;
	

	/**
	 * PREVIOUS CHIROPRACTIC EXPERIENCE
	 */
	private String previousChiropractor;

	private String previousChiropractorPhone;

	private Date lastChiropractorVisit;

	private boolean xRay;
	
	
	/**
	 * MEDICAL HISTORY
	 */
	private String familyDoctorName;

	private String familyDoctorPhone;

	private String familyDoctoryAddress;

	private Date lastFullCheckUp;

	private boolean onMedication;

	private String medicationType1;

	private String medicationType1For;

	private String medicationType1Dose;

	private String medicationType1Frequency;

	private String medicationType2;

	private String medicationType2For;

	private String medicationType2Dose;

	private String medicationType2Frequency;

	private String surgery1;

	private Date surgery1Date;

	private boolean surgery1Complications;

	private String surgery2;

	private Date surgery2Date;

	private boolean surgery2Complications;

	private boolean vision;

	private boolean hearing;

	private boolean smell;

	private boolean taste;

	private boolean dizziness;

	private boolean headaches;

	private boolean difficultySwallowing;

	private boolean lossOfBalance;

	private boolean nightSweats;

	private boolean diabetes;

	private boolean stroke;

	private boolean aneurysm;

	private boolean heartContition;

	private boolean osteoprosis;

	private boolean arthritis;

	private boolean prostateDisorder;

	private boolean menstrualProblems;

	private boolean hepatitis;

	private boolean hivInfected;

	private boolean shortnessOfBreath;

	private boolean cancer;

	private boolean std;

	private boolean tuberculosis;

	private boolean chestPain;

	private boolean highBloodPressure;

	private boolean digestiveProblems;

	private boolean bowlProblems;

	private boolean bladderProblems;

	private boolean significantWeightLoss;

	private boolean pinsAndNeedlesInArm;

	private boolean numbnessInFingers;

	private boolean weaknessInFingers;

	private boolean numblessInLegs;

	private boolean weaknessInLegs;

	private boolean backPain;

	private boolean neckPain;

	private boolean tmjDisorder;

	private boolean earRinging;

	private boolean other;

	private String otherDescription;

	private enum pregnancy {
		YES, NO, MAYBE
	}

	private Date lastMenstrualPeriod;

	private boolean chiropractorToContactMedicalDoctor;

	
	/**
	 * FAMILY HISTORY
	 */
	private boolean familyHeartDisease;

	private boolean familyArthritis;

	private boolean familyCancer;

	private boolean familyDiabetes;

	private boolean familyPsychoSocialDisease;

	private boolean familyOther;

	private boolean familyOtherDescription;

	
	/**
	 * HEALTH HABITS
	 */
	private boolean smoke;

	private String smokeQuantity;

	private boolean didDoDrink;

	private String didDoDrinkHowMuch;

	private String glassesOfWaterPerDate;

	private String sportsExerciseActivity;

	private boolean exerciseRegularly;

	private String exerciseFrequency;

	private enum sleepPosition {
		BACK, SIDE, STOMACH
	}

	private int numberOfPillows;

	private boolean didDoWearOrthodics;

	private boolean nonMedicalCare;

	
	/**
	 * PAST CHILDHOOD
	 */
	private boolean childhoodTruama;

	private Date childhoodTruamaDate;

	private String childhoodTruamaBodyPartInjured;

	private boolean childhoodTruamaInjuryResolved;

	private String childhoodTruamaBriefAccountOfAccident;

	private String childhoodTruamaCareReceivedDoctory;

	private String childhoodTruamaCareTypeGiven;

	
	/**
	 * PAST MOTOR VEHICLE ACCIDENT
	 */
	private boolean motorVehicleAccident;

	private Date motorVehicleAccidentDate;

	private enum driverPassenger {
		DRIVER, PASSENGER
	}

	private boolean seatBelt;

	private enum collision {
		SIDE, FRONT, REAR
	}

	private boolean strikeHead;

	private boolean lossOfConsciousness;

	private boolean sentToHospital;

	private boolean xrayTaken;

	private boolean medicationGiven;

	private String motorAccidentCareReceivedDoctor;

	private String motorAccidentCareGiven;

	private String motorAccidentInjuriesSustained;

	private boolean motorAccidentInjuriesResolved;

	
	/**
	 * PAST HOME/SPORTS ACCIDENT
	 */
	private boolean homeSportsAccident;

	private Date homeSportsAccidentDate;

	private String homeSportsAccidentBodyPartInjured;

	private String homeSportsAccidentBodyPartInjuryResolved;

	private String homeSportsAccidentBriefAccount;

	private String homeSportsCareReceivedDoctor;

	private String homeSportsCareReceivedType;

	
	/**
	 * PAST WORK ACCIDENTS
	 */
	private boolean workAccident;

	private Date workAccidentDate;

	private String workAccidentEmployer;

	private boolean workAccidentclaimMadeWithWSIB;

	private String workAccidentPermanentOrPartialDisability;

	private String workAccidentBodyPartInjured;

	private String workAccidentXRayTaken;

	private String workAccidentBriefAccountOfAccident;

	private String workAccidentCareReceiveDoctor;

	private String workAccidentCareGiven;

	private String workAccidentInjurySustained;

	private boolean workAccidentInjuresResolved;

	
	/**
	 * CURRENT CONDITION/PRESENT COMPLAINT
	 */
	private boolean presentComplaintSharp;

	private boolean presentComplaintSharpSharp;

	private boolean presentComplaintSharpDull;

	private boolean presentComplaintThrobbing;

	private boolean presentComplaintAching;

	private boolean presentComplaintBurning;

	private boolean presentComplaintStabbing;

	private boolean presentComplaintWeakness;

	private boolean presentComplaintNumbness;

	private boolean presentComplaintTingling;

	private boolean presentComplaintOther;

	private String presentComplaintOtherDescription;

	private String presentComplaintLocation;

	private Date presentComplaintWhenItStarted;

	private boolean presentComplaintPreviousOccurance;

	private Date presentComplaintPreviousOccuranceDate;

	private String presentComplaintHow;

	private String presentComplaintWhatMakesWorst;

	private String presentComplaintWhatMakesBetter;

	private boolean presentComplaintPainRadiates;

	private String presentComplaintPainRadiatesWhere;

	private enum presentComplaintPainIs {
		CONSTANT, INTERMITTENT, VARIES, NOPATTERN
	}

	private enum presentComplaintPainScale {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN
	}

	private enum presentComplaintPainWorstIn {
		MORNING, MIDAFTERNOON, EVENING, ATNIGHT
	}

	public void create() {
		// This is not showing up
	}

}
