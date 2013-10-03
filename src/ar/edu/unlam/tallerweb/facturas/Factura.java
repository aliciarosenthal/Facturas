package ar.edu.unlam.tallerweb.facturas;

import java.util.ArrayList;

public class Factura {
	ArrayList<Detalle> lista = new ArrayList<Detalle>();

	private double total;
	private ArrayList<Detalle> item;

	public Factura() {
		this.total = 0;
		this.item = new ArrayList<Detalle>();
	}

	public void addItem(Detalle item) {
		this.item.add(item);
		this.total += item.getTotalDetalle();
	}

	public double getTotal() {
		return total;
	}
}
