package unidade1;
import java.util.Scanner;
public class DescobrirChave {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Entre com o texto original: ");
		String textoOriginal = in.nextLine().toUpperCase();
		System.out.print("Entre com o texto cifrado: ");
		String textoCifrado = in.nextLine().toUpperCase();
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		
		for (int chave = 1; chave <= 25; chave++ ) {		
			String tentativa = "";
			for (int i = 0 ; i < textoOriginal.length(); i++) {
				char caractereOriginal = textoOriginal.charAt(i);
				int pos = alfabeto.indexOf(caractereOriginal);
				if (pos == -1) {
					tentativa += caractereOriginal;
				} else {
					int novaPos = (pos + chave) % 26;
					tentativa += alfabeto.charAt(novaPos);
				}
			}
			if (tentativa.equals(textoCifrado)) {
				System.out.println("A chave utilizada foi: " + chave);
			}

		}

	}

}
