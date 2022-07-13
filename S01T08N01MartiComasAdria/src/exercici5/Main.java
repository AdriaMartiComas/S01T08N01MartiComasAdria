package exercici5;

public class Main {

	public static void main(String[] args) {
		printPi(() -> 3.1415);

	}

	static void printPi(Pi pi) {
		System.out.println(pi.getPiValue());
	}

}
