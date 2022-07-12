package exercici2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> llista = new ArrayList<String>();

		llista.add("Adria");
		llista.add("Maria");
		llista.add("Pol");
		llista.add("Mariona");
		llista.add("Pau");
		llista.add("Eulalia");
		llista.add("Nuria");
		llista.add("Marta");
		llista.add("Julia");
		llista.add("Oriol");

		System.out.println(llista);
		

		
		llista.removeIf(l -> !l.contains("o") || l.length()<5);
		
		
		System.out.println(llista);
		

	}

}
