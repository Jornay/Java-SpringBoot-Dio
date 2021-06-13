package aula1.com.dio_java_avancado;
import java.util.Arrays;
public class FuncoesImutabilidade {

	public static void main(String[] args) {
		int[] valores = {1,2,3,4};
		
		//-------------------------ESSE CÓDIGO---------------------------//
		Arrays.stream(valores)
			.filter(numero -> numero % 2 == 0)				//Verifica se o valor atual do Array tem divisão com resto 0								
			.map(numero -> numero * 2)						//Caso seja, multiplique esse valor por 2
			.forEach(numero -> System.out.println(numero));	// E por fim printe na tela
		
		//----------------------------------------------------------------//
			
		//----------------------EQUIVALE A ESSE CÓDIGO----------------------//
		int valor = 0;
		for(int  i = 0; i < valores.length; i++){
			if(valores[i] % 2 == 0){
				
				valor = valores[i] * 2;
				
				if( valor != 0){
					System.out.println(valor);
				}

			}
		}
		//----------------------------------------------------------------//
	}
}
