package com.geruman.varitas;

public class VaritaPesadaDecorator extends VaritaDecorator implements Varita {

	public VaritaPesadaDecorator(Varita varita) {
		super(varita);
	}

	@Override
	public String agitar() {
		return "Es dificil de blandir, pero finalmente "+super.agitar();
	}

}
