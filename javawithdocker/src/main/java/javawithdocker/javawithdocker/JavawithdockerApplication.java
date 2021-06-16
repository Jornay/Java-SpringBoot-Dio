package javawithdocker.javawithdocker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;



public class JavawithdockerApplication {

	public static void main(String[] args) throws IOException {

		connectAndPrintUrl();
	}

	private static void connectAndPrintUrl() throws IOException{
		
		var  url = new URL("https://www.java.com/pt-BR/");
		var  urlconnection = url.openConnection();
		try(var  bufferedReader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()))){
			System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", "\n"));

		}catch(Exception e){
			e.printStackTrace();

		}
		
	
	}
}
