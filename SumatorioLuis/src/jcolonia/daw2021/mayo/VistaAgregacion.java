package jcolonia.daw2021.mayo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class VistaAgregacion extends Vista {
		
/**
 * Agrega los numeros que introduce el usuario a una lista para cargarlos en pantalla.
 * @param título
 * @param scEntrada
 */
public VistaAgregacion(String título, Scanner scEntrada, ) {
	super(título, scEntrada);
	
	}
	
	Public ArrayList<Double> agregarValores(ArrayList<Double> paraC){
		Scanner entrada = getEntrada();
		String texto;
		Double textoDouble;
		
		texto=entrada.nextLine();
		textoDouble=Double.parseDouble(texto);
		paraC.add(textoDouble);
		return paraC;
	}
}
