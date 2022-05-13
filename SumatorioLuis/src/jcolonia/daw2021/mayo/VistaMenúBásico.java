package jcolonia.daw2021.mayo;

import java.util.Scanner;

public class VistaMenúBásico extends Vista {
	
	private String opcionesMenúPrincipal[];
	private int opcionElegida;

	public VistaMenúBásico(String títuloMenúPrincipal, Scanner entrada, String[] opcionesMenúPrincipal) {
		super(títuloMenúPrincipal, entrada);
		this.opcionesMenúPrincipal = new String[opcionesMenúPrincipal.length];
		for (int i = 0; i < opcionesMenúPrincipal.length; i++) {
			this.opcionesMenúPrincipal[i] = opcionesMenúPrincipal[i];
		}		
	}


	public void mostrarOpciones() {
		for (int i = 0; i < opcionesMenúPrincipal.length; i++) {
			System.out.printf("%s: %d%n", opcionesMenúPrincipal[i], (i + 1));
		}
		System.out.println("0 salir");
		return;
	}


	public int pedirOpción() {
		String lineaTexto;
//
		boolean salir=false;
		while(!salir) {
			System.out.printf("\nIntroduzca un numero de la lista: ");

			lineaTexto = getEntrada().nextLine();
			try {
				opcionElegida = Integer.parseInt(lineaTexto);

				if(opcionElegida<0 || opcionElegida>opcionesMenúPrincipal.length){//con esto nos aseguramos de q solo se meten numeros del 1 al 4.
					throw new NumberFormatException(String.format("Valor fuera de rango: %d",opcionElegida));
				}
				
				
				salir=true;
			}catch(NumberFormatException e) {
				System.out.printf("  ---> ¡ATENCIÓN, ENTRADA MAL! %s%n", e.getMessage());
			}
		}
		return opcionElegida;		
//		
	}
	
}
