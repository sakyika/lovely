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
 * PAST SPORTS ACCIDENT
 */

@Entity
@Table(name = "CHIRO_SPORTS_ACCIDENT")
public class ChiroSportAccident extends BaseEntity {

	@Type(type = "yes_no")
	private boolean sportsAccident;

	@Temporal(TemporalType.TIMESTAMP)
	private Date sportsAccidentDate;

	@Column(name = "BODY_PART_INJURED")
	private String bodyPartInjured;

	@Type(type = "yes_no")
	private boolean injuryResolved;

	@Column(name = "ACCIDENT_BRIEF_ACCOUNT")
	private String accidentBriefAccount;

	@Type(type = "yes_no")
	@Column(name = "MEDICAL_CARE_RECEIVED")
	private boolean medicalCareReceived;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careTypeGiven;

}
