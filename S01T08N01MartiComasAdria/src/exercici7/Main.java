package exercici7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();

		list.add(1);
		list.add((String) "Hola");
		list.add(637);
		list.add("Bona Tarda");
		list.add(76342);
		list.add("si");

		System.out.println(list);

		list.sort((s2, s1) -> String.valueOf(s1).length() - String.valueOf(s2).length());

		System.out.println(list);

	}

}