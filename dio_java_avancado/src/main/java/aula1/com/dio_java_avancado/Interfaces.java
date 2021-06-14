package aula1.com.dio_java_avancado;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interfaces {
    public static void main(String[] args) {
        String[] nomes = {"JoaoPaulo", "Paulo", "Oliver", "SantoDuMonte" , "AMOGUS"};
        imprimirNomesFiltrados(nomes);
    }

    public static void imprimirNomesFiltrados(String... nomes){
        
        String nomesOrganizados = Stream.of(nomes)
            .filter(nome -> nome.equals("AMOGUS"))
            .collect(Collectors.joining());

            System.out.println("Nomes de stream: " + nomesOrganizados);
        
    }
}
