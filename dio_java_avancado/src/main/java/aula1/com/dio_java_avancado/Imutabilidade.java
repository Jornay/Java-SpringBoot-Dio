package aula1.com.dio_java_avancado;

import java.util.function.UnaryOperator;

public class Imutabilidade {
	public static void main(String[] args) {
        int valor = 20;  //É 20
        UnaryOperator<Integer> retornaDobro = v -> v * 2;  //Altera o valor de 20 * 2
        System.out.println(retornaDobro.apply(valor));     // É 40
        System.out.println(valor);   // O valor 20 permanece

        //O conceito da imutabilidade se consiste em manter o valor das variáveis 
        // da mesma maneira que ela foi inicializada ou igualada.
    }
}
