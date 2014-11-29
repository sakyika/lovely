package com.sakk.lovely.model.forms;

import com.sakk.lovely.model.BaseEntity;

/**
 * HEALTH HABITS
 */

public class ChiroHealthHabits extends BaseEntity {

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

}
