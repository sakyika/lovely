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
 * PREVIOUS CHIROPRACTIC EXPERIENCE
 */

@Entity
@Table(name = "CHIRO_EXPERIENCE")
public class ChiroExperience extends BaseEntity {
	
	@Id
	@Column(name = "CHIROEXPERIENCE_ID", unique = true, nullable = false)
	private Integer chiroExperienceId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinTable(name = "CHIROPATIENTINFO_CHIROEXPERIENCES", joinColumns = { @JoinColumn(name = "CHIRO_EXPERIENCE_ID", referencedColumnName = "CHIROEXPERIENCE_ID") }, inverseJoinColumns = { @JoinColumn(name = "CHIRO_PATIENT_ID", referencedColumnName = "PATIENT_ID") })
	private ChiroPatientInfo patientInfo;
	
	@Column(name = "Previous_Chiropractor_Name", length = 50)
	private String previousChiropractorName;

	@Column(name = "Previous_Chiropractor_Phone")
	private String previousChiropractorPhone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChiropractorVisit;

	@Type(type = "yes_no")
	private boolean xRay;

}

