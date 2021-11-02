package com.geruman.varitas;

public class VaritaDecorator implements Varita{
	protected Varita varitaDecorada;
	public VaritaDecorator(Varita varita) {
		this.varitaDecorada = varita;
	}
	@Override
	public String agitar() {
		return varitaDecorada.agitar();
	}
}
