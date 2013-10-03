package ar.edu.unlam.tallerweb.facturas;

public class Detalle {
	int cantidad;
	private Articulo articulo;

	public Detalle(int cantidad, Articulo articulo) {
		this.cantidad = cantidad;
		this.articulo = articulo;
	}

	public double getTotalDetalle() {
		return cantidad * articulo.getPrecioFinal();
	}

}
