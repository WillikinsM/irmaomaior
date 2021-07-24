package numerosIrmaos.will;

import java.util.ArrayList;
import java.util.Collections;

public class NumerosIrmaos {

	public static void main(String[] args) {
		System.out.println(retornarReusltado("123"));

	}

	public static String retornarReusltado(String numeroDigitado) {
		if ((numeroDigitado.length() > 8) || (numeroDigitado.charAt(0) == '-')) {
			String aux = "-1";
			return aux;
		} else {
			String s = String.valueOf(Integer.parseInt(numeroDigitado));
			ArrayList<Integer> numero = new ArrayList<Integer>();
			for (int i = 0; i < s.length(); i++) {
				numero.add(Integer.valueOf(Character.toString(s.charAt(i))));
			}
			Collections.sort(numero);
			Collections.reverse(numero);
			return numero.toString().replaceAll("\\D*", "").trim();
		}

	}

}
