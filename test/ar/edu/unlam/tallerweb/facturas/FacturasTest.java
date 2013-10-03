package ar.edu.unlam.tallerweb.facturas;

import org.junit.Assert;
import org.junit.Test;

public class FacturasTest {
	ArticuloBasico tomate = new ArticuloBasico(15);
	Detalle tomates = new Detalle(6, tomate);

	ArticuloLujo cif = new ArticuloLujo(15);
	Detalle cifs = new Detalle(6, cif);

	ArticuloBasico pepino = new ArticuloBasico(50);
	Detalle pepinos = new Detalle(5, pepino);

	Factura factura1 = new Factura();

	@Test
	public void mostrarPrecioArticuloBasico() {
		Assert.assertTrue(tomate.getPrecioFinal() == 18.15);

	}

	@Test
	public void mostrarPrecioArticuloLujo() {
		Assert.assertEquals(20.4, cif.getPrecioFinal(), 0.1);

	}

	@Test
	public void subtotalDetalle() {
		Assert.assertEquals(122.4, cifs.getTotalDetalle(), 0.1);

	}

	@Test
	public void sumarTotal() {
		factura1.addItem(pepinos);
		factura1.addItem(tomates);
		Assert.assertEquals(411.4, factura1.getTotal(), 0.1);

	}

}
