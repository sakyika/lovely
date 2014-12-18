package com.sakk.lovely.model.forms;

import com.sakk.lovely.model.forms.chiropractic.ChiropracticForm;

public abstract class FormAbstractFactory {

	public abstract ChiropracticForm getChiropracticForm(String chiropracticForm);

	public abstract MassageForm getMassageForm(String massageForm);

}
