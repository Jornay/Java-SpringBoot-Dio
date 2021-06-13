
package aula1.com.dio_java_avancado;

import java.util.function.UnaryOperator;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParadigmaFuncional {

	public static void main(String[] args) {

		UnaryOperator<Integer> calculaVezesTrinta = valor -> valor * 3;    //Cpnceito principal do funcionamento da linguagem funcional

		int valor = 10;
		System.out.println("O resultado é: " + calculaVezesTrinta.apply(10));
	}

}
