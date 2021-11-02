package com.geruman.varitas;

public class VaritaMagicaDecorator extends VaritaDecorator implements Varita {

	public VaritaMagicaDecorator(Varita varita) {
		super(varita);
	}

	@Override
	public String agitar() {
		return varitaDecorada.agitar()+", y magia se huele en el aire.";
	}

}
