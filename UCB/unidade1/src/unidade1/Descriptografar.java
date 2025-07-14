package unidade1;
import java.util.Scanner;
public class Descriptografar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Entre com o texto cifrado: ");
		String textoCifrado = in.nextLine().toUpperCase();
		System.out.print("Entre com a chave para descriptografar: ");
		int chave = in.nextInt();
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String textoOriginal = "";
		for (int i = 0; i < textoCifrado.length(); i++) {
			char caractereCifrado = textoCifrado.charAt(i);
			int pos = alfabeto.indexOf(caractereCifrado);
			if (pos == -1) {
				textoOriginal += caractereCifrado;
			} else {
				int novaPos = (pos - chave + 26) % 26;
				textoOriginal += alfabeto.charAt(novaPos);
			}
		}
		System.out.println("Texto Original: " + textoOriginal);	
	}
}
