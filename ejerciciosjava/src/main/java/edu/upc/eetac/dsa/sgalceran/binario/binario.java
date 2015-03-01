package edu.upc.eetac.dsa.sgalceran.binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class binario {
	
	private int numero;
	private double decimal;
	private char nombre;
	
	public binario(int numero, double decimal, char nombre)
	{
		this.numero= numero;
		this.decimal=decimal;
		this.nombre = nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getDecimal() {
		return decimal;
	}
	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}
	public char getNombre() {
		return nombre;
	}
	public void setNombre(char nombre) {
		this.nombre = nombre;
	}
	
	public void  escribir_fichero(String nombre) throws IOException
	{
		ObjectOutputStream datos = null;     
		
						 
			datos = new ObjectOutputStream(
			 
			new FileOutputStream(nombre));
			 
			datos.writeObject(numero);
			datos.writeObject(decimal);
			datos.writeObject(this.nombre);			
			datos.close();
			
	}
	public final static binario crear_clase (String ruta) throws IOException
	{
			
			DataInputStream dis=new DataInputStream(new FileInputStream(ruta));
			int num= dis.readInt();
			double dec= dis.readDouble();
			char nom= dis.readChar();
			return new binario(num,dec,nom);
				
	}
			
		
	}
			
	


