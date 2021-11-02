package com.geruman.varitas;

public class VaritaInvisibilidadDecorator extends VaritaDecorator implements Varita {

	public VaritaInvisibilidadDecorator(Varita varita) {
		super(varita);
	}

	@Override
	public String agitar() {
		return super.agitar()+" Te vuelves invisible";
	}

}
