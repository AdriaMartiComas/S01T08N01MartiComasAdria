package exercici8;

public class Main {

	public static void main(String[] args) {

		String frase = "Aquesta frase estara al reves.";
		System.out.println(frase);

		StringReverse stringReverse = (a) -> {
			a = new StringBuilder(a).reverse().toString();
			return a;
		};

		System.out.println(stringReverse.reverse(frase));

	}

}

/*
 * Crea una Functional Interface que contingui un mètode anomenat reverse().
 * Aquest mètode ha de rebre i ha de retornar un String. En el main() de la
 * classe principal, injecta a la interfície creada mitjançant una lambda, el
 * cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre
 * però al revés. Invoca la instància de la interfície passant-li una cadena i
 * comprova si el resultat és correcte.
 * 
 */