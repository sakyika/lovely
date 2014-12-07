package com.sakk.lovely.model.forms;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;

/**
 * FAMILY HISTORY
 */

public class ChiroFamilyHistory extends BaseEntity {

	@Type(type = "yes_no")
	private boolean familyHeartDisease;

	@Type(type = "yes_no")
	private boolean familyArthritis;

	@Type(type = "yes_no")
	private boolean familyCancer;

	@Type(type = "yes_no")
	private boolean familyDiabetes;

	@Type(type = "yes_no")
	private boolean familyPsychoSocialDisease;

	@Type(type = "yes_no")
	private boolean familyOther;

	@Type(type = "yes_no")
	private boolean familyOtherDescription;

}
