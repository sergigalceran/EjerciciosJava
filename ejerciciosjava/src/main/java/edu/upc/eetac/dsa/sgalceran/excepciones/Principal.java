package edu.upc.eetac.dsa.sgalceran.excepciones;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        String entradaTeclado = entradaEscaner.nextLine ();

        try {
            double media = lectura.media(entradaTeclado);
            System.out.println("La media es = " + media);
        } catch (FileParsingException e) {
            e.printStackTrace();
        } catch (BigNumberException e) {
            e.printStackTrace();
        }
    }
}

