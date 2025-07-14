package unidade2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CriarFigurasGeometricas {

	public static void main(String[] args) {
		String nome;
		double base, altura, raio;
		Scanner in = new Scanner(System.in);
		List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;
		System.out.print("Crie figuras geometricas:\n");
		System.out.print("Lista de comandos disponíveis:\n1- Criar novo retângulo.\n2- Criar novo triângulo.\n3- Criar novo círculo.\n 0- Sair.\n");

		while (true) {
			System.out.print("Escolha um comando\n");
			int opcao = in.nextInt();
			if (opcao == 1) {
				nome = "Retângulo";
				System.out.print("Digite a base do retângulo: ");
				base = in.nextDouble();
				System.out.print("Digite a altura do retângulo: ");
				altura = in.nextDouble();
				Retangulo novoRetangulo = new Retangulo(nome, base, altura);
			    listaFigurasGeometricas.add(novoRetangulo);
			}
			else if (opcao == 2) {
				nome = "Triângulo";
				System.out.print("Digite a base do triangulo: ");
				base = in.nextDouble();
				System.out.print("Digite a altura do triangulo: ");
				altura = in.nextDouble();
				Triangulo novoTriangulo = new Triangulo(nome, base, altura);
			    listaFigurasGeometricas.add(novoTriangulo);
			}
			else if (opcao == 3) {
				nome = "Círculo";
				System.out.print("Digite o raio do círculo: ");
				raio = in.nextDouble();
				Circulo novoCirculo = new Circulo(nome, raio);
			    listaFigurasGeometricas.add(novoCirculo);
				
			}
			else if (opcao == 0) {
				break;
			}
			else {
				System.out.print("Comando inválido. Por favor tente novamente.");
			}
			
			
		}
		
	    for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
	        System.out.println( figuraGeometrica.getDescricao() );
	        System.out.printf( "Area da figura: %.2f \n", figuraGeometrica.getArea() );

	    }

	}
}
