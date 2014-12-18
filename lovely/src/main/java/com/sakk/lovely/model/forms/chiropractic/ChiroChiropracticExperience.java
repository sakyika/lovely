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
 * PREVIOUS CHIROPRACTIC EXPERIENCE
 */

@Entity
@Table(name = "CHIROPRACTOR_EXPERIENCE")
public class ChiroChiropracticExperience extends BaseEntity {

	@Column(name = "Previous_Chiropractor_Name", length = 50)
	private String previousChiropractorName;

	@Column(name = "Previous_Chiropractor_Phone")
	private String previousChiropractorPhone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastChiropractorVisit;

	@Type(type = "yes_no")
	private boolean xRay;

}
