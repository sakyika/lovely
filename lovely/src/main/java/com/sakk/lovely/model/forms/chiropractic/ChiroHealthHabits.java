package com.sakk.lovely.model.forms.chiropractic;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.SleepPosition;

/**
 * HEALTH HABITS
 */

@Entity
@Table(name = "CHIRO_HEALTH_HABITS")
public class ChiroHealthHabits extends BaseEntity {

	@Id
	@Column(name = "HEALTHHABITS_ID", unique = true, nullable = false)
	private Integer healthHabits;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_HEALTHHABITS", joinColumns = { @JoinColumn(name = "HEALTH_HABITS_ID", referencedColumnName = "HEALTHHABITS_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;
	
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

}
