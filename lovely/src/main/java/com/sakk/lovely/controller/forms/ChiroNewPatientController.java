package com.sakk.lovely.controller.forms;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/chiroNewPatientForm")
@PreAuthorize("denyAll")
public class ChiroNewPatientController {

}
