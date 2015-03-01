package edu.upc.eetac.dsa.sgalceran.interfaces;

public abstract class abstractShape implements Shape{
	
	private String tipo;	
	
	public abstractShape(String tipo)
	{
		this.setTipo(tipo);
	}
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
    public String toString() {
        return "I'm a " + tipo;
    }
	

	

}
