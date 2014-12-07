package com.sakk.lovely.model.forms;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "CHIRO_GENERALINFO")
public class ChiropPatientGeneralInfo extends BaseEntity {

	private static final long serialVersionUID = 96285180113476324L;
	static Logger logger = LoggerFactory.getLogger(ChiropPatientGeneralInfo.class);

	@Enumerated(EnumType.STRING)
	private Title title;

	@Column(name = "firstname", length = 50)
	private String firstName;

	@Column(name = "lastname", length = 50)
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DOB")
	private Date DOB;

	@Column(name = "address", length = 50)
	private String address;

	@Column(name = "homephone", length = 50)
	private String homePhone;

	@Column(name = "workphone", length = 50)
	private String workPhone;

	@Column(name = "cellphone", length = 50)
	private String cellPhone;

	@Column(name = "occupation", length = 50)
	private String occupation;

	@Column(name = "employer", length = 50)
	private String employer;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "hearaboutus", length = 50)
	private String hearAboutUs;

	@Column(name = "emergency_contact", length = 50)
	private String emergencyContact;

	@Column(name = "emergency_contact_phone", length = 50)
	private String emergencyContactPhone;

}
