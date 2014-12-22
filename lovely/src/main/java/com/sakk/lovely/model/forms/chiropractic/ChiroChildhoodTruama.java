package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
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
	
	@Id
	@Column(name = "CHILDHOODTRUAMA_ID", unique = true, nullable = false)
	private Integer childhoodTruamaId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENT_CHILDHOODTRUAMA", joinColumns = { @JoinColumn(name = "CHILDHOOD_TRUAMA_ID", referencedColumnName = "CHILDHOODTRUAMA_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatient patientInfo;

	@Type(type = "yes_no")
	@Column(name = "CHILDHOOD_TRUAMA")
	private boolean childhoodTruama;

	@Temporal(TemporalType.DATE)
	@Column(name = "CHILDHOOD_TRUAMA_DATE")
	private Date childhoodTruamaDate;

	@Column(name = "BODY_PART_INJURED")
	private String bodyPartInjured;

	@Type(type = "yes_no")
	@Column(name = "INJURY_RESOLVED")
	private boolean injuryResolved;

	@Column(name = "BRIEF_ACCOUNT_OF_TRUAMA")
	private String briefAccountOfAccident;

	@Type(type = "yes_no")
	@Column(name = "MEDICAL_CARE_RECEIVED")
	private boolean medicalCareReceived;

	@Column(name = "CARE_GIVEN_BY")
	private String careGivenBy;

	@Column(name = "TYPE_OF_CARE_GIVEN")
	private String careTypeGiven;

}
