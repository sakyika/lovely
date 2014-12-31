package com.sakk.lovely.chiropractic.forms.type;

import com.sakk.lovely.chiropractic.forms.model.ChiropracticForm;

public abstract class FormAbstractFactory {

	public abstract ChiropracticForm getChiropracticForm(String chiropracticForm);

	public abstract MassageForm getMassageForm(String massageForm);

}
