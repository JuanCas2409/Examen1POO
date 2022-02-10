package com.Examen1.jcc;

public class Main {
	
	public static void main(String[] args)
	{
		Biblioteca bib1 = new Biblioteca("1234", "Biblioteca Benito Juarez", "Av Adolfo Lopez Mateos", 1920);
		bib1.nuevoeprofesor("Juan","Castillo", 20, "H");
		bib1.nuevoeprofesor("Pepe", "Pistolas", 30, "H");
		bib1.nuevoestudiante("Mandy", "Frisch", 13, "M");
		
		
		bib1.imprimirusuarios();
	}

}
