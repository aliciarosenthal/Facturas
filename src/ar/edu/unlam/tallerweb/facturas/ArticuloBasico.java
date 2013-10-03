package ar.edu.unlam.tallerweb.facturas;

public class ArticuloBasico extends Articulo {

	public ArticuloBasico(double precio) {
		super(precio);
	}
	@Override
	public double getImpuesto() {
		return 1.21;
	}

}
