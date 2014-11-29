package com.sakk.lovely.model.forms;

import java.util.Date;

import com.sakk.lovely.model.BaseEntity;

/**
 * 
 * General Information
 *
 */

public class ChiroGeneralInfo extends BaseEntity {

	private static enum TITLE {
		MR, MRS, MISS, MS, DR
	}

	private String firstName;

	private String lastName;

	private Date dateOfBirth;

	private String address;

	private String homePhone;

	private String workPhone;

	private String cellPhone;

	private String Occupation;

	private String employer;

	private String email;

	private String hearAboutUs;

	private String emergencyContact;

	private String emergencyContactPhone;

}
