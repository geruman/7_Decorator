package com.geruman;
import com.geruman.varitas.Varita;
import com.geruman.varitas.VaritaDeMadera;
import com.geruman.varitas.VaritaInvisibilidadDecorator;
import com.geruman.varitas.VaritaMagicaDecorator;
import com.geruman.varitas.VaritaPesadaDecorator;

public class DecoratorDemoMain {

	public static void main(String[] args) {
		Varita varita = new VaritaDeMadera();
		Varita varitaDecorada = new VaritaInvisibilidadDecorator(varita);
		System.out.println(varitaDecorada.agitar());
		Varita varitaDecoradaPesada= new VaritaPesadaDecorator(varita);
		System.out.println(varitaDecoradaPesada.agitar());
		Varita varitaDecoradaMagica = new VaritaMagicaDecorator(varita);
		System.out.println(varitaDecoradaMagica.agitar());
		Varita varitaDecoradaCompuesta = new VaritaInvisibilidadDecorator(varitaDecoradaMagica);
		System.out.println(varitaDecoradaCompuesta.agitar());
	}
}
