package unidade1;
import java.util.Scanner;
public class Criptografar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Entre com o texto para criptografar: ");
		String textoOriginal = in.nextLine().toUpperCase();
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int chave = (int) (Math.random() * 25 + 1);
		String textoCifrado = "";
		for (int i = 0 ; i < textoOriginal.length(); i++) {
			char caractereOriginal = textoOriginal.charAt(i);
			int pos = alfabeto.indexOf(caractereOriginal);
			if (pos == -1) {
				textoCifrado += caractereOriginal;
			} else {
				int novaPos = (pos + chave) % 26;
				textoCifrado += alfabeto.charAt(novaPos);
			}
		}
		System.out.println("Texto criptografado: " + textoCifrado);
	}
}
