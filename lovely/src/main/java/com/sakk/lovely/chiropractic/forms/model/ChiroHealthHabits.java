package com.sakk.lovely.chiropractic.forms.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.core.model.BaseEntity;
import com.sakk.lovely.core.model.SleepPosition;

/**
 * HEALTH HABITS
 */

@Entity
@Table(name = "CHIRO_HEALTH_HABITS")
public class ChiroHealthHabits extends BaseEntity {
	
	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroHealthHabits.class);

	@Column(name = "HEALTHHABITS_ID", unique = true, nullable = false)
	private Integer healthHabitsId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_HEALTHHABITS", joinColumns = { @JoinColumn(name = "HEALTH_HABITS_ID", referencedColumnName = "HEALTHHABITS_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "CHIROPATIENT_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	@Column(name = "SMOKER")
	private boolean smoke;

	@Column(name = "SMOKE_QUANTITY")
	private String smokeQuantity;

	@Type(type = "yes_no")
	@Column(name = "DID_DO_DRINK")
	private boolean didDoDrink;

	@Column(name = "AMOUNT_OF_DRINKS")
	private String didDoDrinkHowMuch;

	@Column(name = "AMOUNT_OF_WATER")
	private String glassesOfWaterPerDay;

	@Column(name = "SPORTS_EXERCISE_ACTIVITY")
	private String sportsExerciseActivity;

	@Type(type = "yes_no")
	@Column(name = "EXERCISE_REGULARLY")
	private boolean exerciseRegularly;

	@Column(name = "EXERCISE_FREQUENCY")
	private String exerciseFrequency;

	@Enumerated(EnumType.STRING)
	@Column(name = "SLEEP_POSITION")
	private SleepPosition sleepPosition;

	@Column(name = "NUMBER_OF_PILLOWS")
	private String numberOfPillows;

	@Type(type = "yes_no")
	@Column(name = "DID_DO_WEAR_ORTHODICS")
	private boolean didDoWearOrthodics;

	@Type(type = "yes_no")
	@Column(name = "NONE_MEDICAL_CARE")
	private boolean noneMedicalCare;

	public Integer getHealthHabits() {
		return healthHabitsId;
	}

	public void setHealthHabits(Integer healthHabits) {
		this.healthHabitsId = healthHabits;
	}

	public ChiroPatient getPatientInfo() {
		return patientInfo;
	}

	public void setPatientInfo(ChiroPatient patientInfo) {
		this.patientInfo = patientInfo;
	}

	public boolean isSmoke() {
		return smoke;
	}

	public void setSmoke(boolean smoke) {
		this.smoke = smoke;
	}

	public String getSmokeQuantity() {
		return smokeQuantity;
	}

	public void setSmokeQuantity(String smokeQuantity) {
		this.smokeQuantity = smokeQuantity;
	}

	public boolean isDidDoDrink() {
		return didDoDrink;
	}

	public void setDidDoDrink(boolean didDoDrink) {
		this.didDoDrink = didDoDrink;
	}

	public String getDidDoDrinkHowMuch() {
		return didDoDrinkHowMuch;
	}

	public void setDidDoDrinkHowMuch(String didDoDrinkHowMuch) {
		this.didDoDrinkHowMuch = didDoDrinkHowMuch;
	}

	public String getGlassesOfWaterPerDay() {
		return glassesOfWaterPerDay;
	}

	public void setGlassesOfWaterPerDay(String glassesOfWaterPerDay) {
		this.glassesOfWaterPerDay = glassesOfWaterPerDay;
	}

	public String getSportsExerciseActivity() {
		return sportsExerciseActivity;
	}

	public void setSportsExerciseActivity(String sportsExerciseActivity) {
		this.sportsExerciseActivity = sportsExerciseActivity;
	}

	public boolean isExerciseRegularly() {
		return exerciseRegularly;
	}

	public void setExerciseRegularly(boolean exerciseRegularly) {
		this.exerciseRegularly = exerciseRegularly;
	}

	public String getExerciseFrequency() {
		return exerciseFrequency;
	}

	public void setExerciseFrequency(String exerciseFrequency) {
		this.exerciseFrequency = exerciseFrequency;
	}

	public SleepPosition getSleepPosition() {
		return sleepPosition;
	}

	public void setSleepPosition(SleepPosition sleepPosition) {
		this.sleepPosition = sleepPosition;
	}

	public String getNumberOfPillows() {
		return numberOfPillows;
	}

	public void setNumberOfPillows(String numberOfPillows) {
		this.numberOfPillows = numberOfPillows;
	}

	public boolean isDidDoWearOrthodics() {
		return didDoWearOrthodics;
	}

	public void setDidDoWearOrthodics(boolean didDoWearOrthodics) {
		this.didDoWearOrthodics = didDoWearOrthodics;
	}

	public boolean isNoneMedicalCare() {
		return noneMedicalCare;
	}

	public void setNoneMedicalCare(boolean noneMedicalCare) {
		this.noneMedicalCare = noneMedicalCare;
	}

}
