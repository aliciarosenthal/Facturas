package ar.edu.unlam.tallerweb.facturas;

public class ArticuloLujo extends Articulo{

	public ArticuloLujo(double precio) {
		super(precio);
	}
	@Override
	public double getImpuesto() {
		return 1.36;
	}

}
