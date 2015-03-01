package edu.upc.eetac.dsa.sgalceran.interfaces;

public class Circulo extends abstractShape{
	
	private double radio;
	
	public Circulo (double radio)
	{	
		super("circulo");
	}
	public double area()
	{
		return (Math.PI*radio*radio);
	}
}
