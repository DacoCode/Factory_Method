package com.factory;

import com.personalTrabajo.impl.PersonalGestion;
import com.personalTrabajo.impl.PersonalInvestigacion;
import com.personalTrabajo.impl.PersonalVigilancia;
import com.personalTrabajo.interfaz.PersonalTrabajo;

public class personalFactory {

	public PersonalTrabajo getPersonal(String per) {
		
		if(per.equalsIgnoreCase("Gestion")) {
			return new  PersonalGestion();
		}else if(per.equalsIgnoreCase("Vigilancia")) {
			return new PersonalVigilancia();
		}else if(per.equalsIgnoreCase("Investigacion")) {
			return new PersonalInvestigacion();
		}
	
		return null;
		
	}
	
}
