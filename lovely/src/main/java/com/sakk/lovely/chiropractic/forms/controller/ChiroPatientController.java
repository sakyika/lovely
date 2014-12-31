package com.sakk.lovely.chiropractic.forms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sakk.lovely.chiropractic.forms.model.ChiroPatient;
import com.sakk.lovely.chiropractic.forms.service.ChiroPatientService;

@Controller
@RequestMapping(value = "/chiropatient")
public class ChiroPatientController {
	static Logger logger = LoggerFactory
			.getLogger(ChiroPatientController.class);
	static String businessObject = "chiropatient"; // used in RedirectAttributes
													// messages
/*
	@Autowired
	private ChiroPatientService patientService;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	// @PreAuthorize("hasRole('CTRL_STRATEGY_LIST_GET')")
	public String listOfStrategies(Model model) {
		logger.debug("IN: ChiroPatient/list-GET");

		List<ChiroPatient> patients = patientService.getPatients();
		model.addAttribute("strategies", patients);

		// if there was an error in /add, we do not want to overwrite
		// the existing chiro-patient object containing the errors.
		if (!model.containsAttribute("strategy")) {
			logger.debug("Adding ChiroPatient object to model");
			ChiroPatient patient = new ChiroPatient();
			model.addAttribute("patient", patient);
		}
		return "patient-list";
	}
*/
}
