package com.geruman.tests;

import org.junit.jupiter.api.Test;

import com.geruman.varitas.Varita;
import com.geruman.varitas.VaritaDeMadera;
import com.geruman.varitas.VaritaInvisibilidadDecorator;
import com.geruman.varitas.VaritaMagicaDecorator;
import com.geruman.varitas.VaritaPesadaDecorator;

class VaritaTest {

	@Test
	void agitarVaritaConDecoradoresTest() {
		Varita varita = new VaritaDeMadera();
		assert "la varita se agita con suavidad".equals(varita.agitar());
		varita = new VaritaMagicaDecorator(varita);
		assert "la varita se agita con suavidad, y magia se huele en el aire.".equals(varita.agitar());
		varita = new VaritaInvisibilidadDecorator(varita);
		assert "la varita se agita con suavidad, y magia se huele en el aire. Te vuelves invisible".equals(varita.agitar());
		varita = new VaritaPesadaDecorator(varita);
		assert "Es dificil de blandir, pero finalmente la varita se agita con suavidad, y magia se huele en el aire. Te vuelves invisible".equals(varita.agitar());
	}

}
