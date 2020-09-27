package com.factory;

import com.personalTrabajo.interfaz.PersonalTrabajo;

public class factoryPattern {

	public static void main(String[] args) {
		
		String personalGestion = "Gestion";
		String personalVigilancia = "Vigilancia";
		String personalInves = "Investigacion";
		
		personalFactory factory = new personalFactory(); //Instanciamos la fabrica
		
		PersonalTrabajo per = factory.getPersonal(personalGestion); //Le pedimos el objeto en especifico: personal de gestion
		per.Acceder();
		
		PersonalTrabajo perV = factory.getPersonal(personalVigilancia);
		perV.Acceder();
		
		PersonalTrabajo perI = factory.getPersonal(personalInves);
		perI.Acceder();
	}

} 
