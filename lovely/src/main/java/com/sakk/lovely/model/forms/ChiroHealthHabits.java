package com.sakk.lovely.model.forms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

	@Type(type = "yes_no")
	private boolean smoke;

	@Column(name = "SMOKE_QUANTITY")
	private String smokeQuantity;

	@Type(type = "yes_no")
	private boolean didDoDrink;

	@Column(name = "AMOUNT_OF_DRINKS")
	private String didDoDrinkHowMuch;

	@Column(name = "AMOUNT_OF_WATER")
	private String glassesOfWaterPerDay;

	@Column(name = "SPORTS_EXERCISE_ACTIVITY")
	private String sportsExerciseActivity;

	@Type(type = "yes_no")
	private boolean exerciseRegularly;

	@Column(name = "EXERCISE_FREQUENCY")
	private String exerciseFrequency;

	@Enumerated(EnumType.STRING)
	private SleepPosition sleepPosition;

	@Column(name = "NUMBER_OF_PILLOWS")
	private String numberOfPillows;

	@Type(type = "yes_no")
	private boolean didDoWearOrthodics;

	@Type(type = "yes_no")
	private boolean nonMedicalCare;

}
