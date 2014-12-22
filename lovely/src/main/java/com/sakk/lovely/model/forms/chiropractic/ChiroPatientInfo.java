package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sakk.lovely.model.BaseEntity;
import com.sakk.lovely.model.Title;

/**
 * 
 * General Information
 *
 */

@Entity
@Table(name = "CHIRO_PATIENT_INFO")
public class ChiroPatientInfo extends BaseEntity {

	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiroPatientInfo.class);

	@Id
	@Column(name = "PATIENT_ID", unique = true, nullable = false)
	private Integer patientId;

	@Enumerated(EnumType.STRING)
	@Column(name = "TITLE")
	private Title title;

	@Column(name = "FIRST_NAME", length = 50)
	private String firstName;

	@Column(name = "LAST_NAME", length = 50)
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DOB")
	private Date DOB;

	@Column(name = "ADDRESS", length = 50)
	private String address;

	@Column(name = "HOME_PHONE", length = 50)
	private String homePhone;

	@Column(name = "WORK_PHONE", length = 50)
	private String workPhone;

	@Column(name = "CELL_PHONE", length = 50)
	private String cellPhone;

	@Column(name = "OCCUPATION", length = 50)
	private String occupation;

	@Column(name = "EMPLOYER", length = 50)
	private String employer;

	@Column(name = "EMAIL", length = 50)
	private String email;

	@Column(name = "HEAR_ABOUT_US", length = 50)
	private String hearAboutUs;

	@Column(name = "EMERGENCY_CONTACT", length = 50)
	private String emergencyContact;

	@Column(name = "EMERGENCY_CONTACT_PHONE", length = 50)
	private String emergencyContactPhone;

}
