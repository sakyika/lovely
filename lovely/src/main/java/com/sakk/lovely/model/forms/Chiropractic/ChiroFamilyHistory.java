package com.sakk.lovely.model.forms.Chiropractic;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;

/**
 * FAMILY HISTORY
 */

@Entity
@Table(name = "CHIRO_FAMILY_HISTORY")
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
