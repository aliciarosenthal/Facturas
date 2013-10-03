package ar.edu.unlam.tallerweb.facturas;

public abstract class Articulo {
	protected double precio;
	
	public Articulo (double precio)
	{
		this.precio=precio;
	}
	public double getPrecioFinal (){
		return precio*this.getImpuesto();
	}
	public abstract double getImpuesto();
}
