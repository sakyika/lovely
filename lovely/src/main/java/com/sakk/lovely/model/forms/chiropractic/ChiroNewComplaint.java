package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import com.sakk.lovely.model.BaseEntity;

/**
 * CURRENT CONDITION/PRESENT COMPLAINT
 */

public class ChiroNewComplaint extends BaseEntity {

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

}
