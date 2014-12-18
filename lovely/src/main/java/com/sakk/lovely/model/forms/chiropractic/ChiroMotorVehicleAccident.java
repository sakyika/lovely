package com.sakk.lovely.model.forms.chiropractic;

import java.util.Date;

import com.sakk.lovely.model.BaseEntity;

/**
 * PAST MOTOR VEHICLE ACCIDENT
 */

public class ChiroMotorVehicleAccident extends BaseEntity {

	private boolean motorVehicleAccident;

	private Date motorVehicleAccidentDate;

	private enum driverPassenger {
		DRIVER, PASSENGER
	}

	private boolean seatBelt;

	private enum collision {
		SIDE, FRONT, REAR
	}

	private boolean strikeHead;

	private boolean lossOfConsciousness;

	private boolean sentToHospital;

	private boolean xrayTaken;

	private boolean medicationGiven;

	private String motorAccidentCareReceivedDoctor;

	private String motorAccidentCareGiven;

	private String motorAccidentInjuriesSustained;

	private boolean motorAccidentInjuriesResolved;

}
