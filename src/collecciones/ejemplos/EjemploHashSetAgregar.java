package collecciones.ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjemploHashSetAgregar {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();// no es ordenador y no permite duplicados
		hs.add("uno");
		hs.add("dos");
		hs.add("tres");
		hs.add("cuatro");
		hs.add("cinco");
		System.out.println(hs);
		Collections.sort(hs);
		boolean b = hs.add("dos");
		System.out.println("permitir elementos duplicados " + b);
		System.out.println(hs);
		
		
	}

}
