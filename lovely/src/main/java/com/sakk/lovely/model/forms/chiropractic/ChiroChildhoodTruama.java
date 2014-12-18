package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

import com.sakk.lovely.model.BaseEntity;

/**
 * PAST CHILDHOOD
 */

@Entity
@Table(name = "CHIRO_CHILDHOOD_TRUAMA")
public class ChiroChildhoodTruama extends BaseEntity {

	@Type(type = "yes_no")
	private boolean childhoodTruama;

	@Temporal(TemporalType.DATE)
	private Date childhoodTruamaDate;

	@Column(name = "BODY_PART_INJURED")
	private String bodyPartInjured;

	@Type(type = "yes_no")
	private boolean injuryResolved;

	@Column(name = "BRIEF_ACCOUNT_OF_TRUAMA")
	private String briefAccountOfAccident;

	@Type(type = "yes_no")
	private boolean medicalCareReceived;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careTypeGiven;

}
