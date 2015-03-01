package edu.upc.eetac.dsa.sgalceran.binario;

import java.io.IOException;

public class principal {
	

	public static void main(String[] args) throws IOException {
	
	binario ejemplo= new binario(3, 3.5, 'e');
	ejemplo.escribir_fichero("ejemplo");	
	binario ej2 = binario.crear_clase("ejemplo");
	System.out.println(""+ej2.getDecimal());
	System.out.println(""+ej2.getNumero());
	System.out.println(""+ej2.getNombre());

	}

}
