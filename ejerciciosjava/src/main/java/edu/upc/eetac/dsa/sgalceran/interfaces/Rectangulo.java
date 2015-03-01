package edu.upc.eetac.dsa.sgalceran.interfaces;

public class Rectangulo extends abstractShape{
	private int lado;
	private int lado2;
	
	public Rectangulo (int lado, int lado2)
	{
		super("rectangulo");
		this.lado=lado;
		this.lado2=lado2;
	}			
	public double area()
	{
		return (lado*lado2);
	}	

}
