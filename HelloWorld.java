package unidade3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CriarFigurasGeometricas {

	public static void main(String[] args) {
		String nome;
		double base, altura, raio;
		Scanner in = new Scanner(System.in);
		List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;

		while (true) {
			System.out.print("Crie figuras geometricas:\n");
			System.out.print("Lista de comandos disponíveis:\n1- Criar novo retângulo.\n2- Criar novo triângulo.\n3- Criar novo círculo.\n0- Sair.\n");
			System.out.print("Escolha um comando\n");
			int opcao = in.nextInt();
			if (opcao == 1) {
				System.out.print("Digite o nome do retângulo a ser criado: ");
				nome = in.next();
				System.out.print("Digite a base do retângulo: ");
				base = in.nextDouble();
				System.out.print("Digite a altura do retângulo: ");
				altura = in.nextDouble();
				Retangulo novoRetangulo = new Retangulo(nome, base, altura);
			    listaFigurasGeometricas.add(novoRetangulo);
			}
			else if (opcao == 2) {
				System.out.print("Digite o nome do triângulo a ser criado: ");
				nome = in.next();
				System.out.print("Digite a base do triangulo: ");
				base = in.nextDouble();
				System.out.print("Digite a altura do triangulo: ");
				altura = in.nextDouble();
				Triangulo novoTriangulo = new Triangulo(nome, base, altura);
			    listaFigurasGeometricas.add(novoTriangulo);
			}
			else if (opcao == 3) {
				System.out.print("Digite o nome do círculo a ser criado: ");
				nome = in.next();
				System.out.print("Digite o raio do círculo: ");
				raio = in.nextDouble();
				Circulo novoCirculo = new Circulo("Circulo", raio);
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
package unidade3;

public abstract class FiguraGeometrica {
	private String nome;
	
	public FiguraGeometrica(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public abstract double getArea();

	public abstract String getDescricao();
	
}
package unidade3;

public class Retangulo extends FiguraGeometrica {
	private double base, altura;
	
	public Retangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double baseRetangulo) {
		this.base = baseRetangulo;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double alturaRetangulo) {
		this.altura = alturaRetangulo;
	}
	
	@Override
	public double getArea() {
		return base  * altura;
	}
	
	@Override public String getDescricao() {
		return getNome() + " é um retângulo de base " + getBase() + " e de altura " + getAltura();
	}
}
package unidade3;

public class Triangulo extends FiguraGeometrica{
	private double base, altura;
	
		public Triangulo(String nome, double base, double altura) {
			super(nome);
			this.base = base;
			this.altura = altura;
		}
		
		public double getBase() {
			return base;
		}
		
		public void setBase(double baseTriangulo) {
			this.base = baseTriangulo;
		}
		
		public double getAltura() {
			return altura;
		}
		
		public void setAltura(double alturaTriangulo) {
			this.altura = alturaTriangulo;
		}
	
		@Override
		public double getArea() {
			return (base  * altura) / 2;
		}
	
		@Override public String getDescricao() {
			return getNome() + " é um triangulo de base " + getBase() + " e de altura " + getAltura();
		}
}
package unidade3;

public class Circulo extends FiguraGeometrica{
	private double raio;
	private static final double pi =  3.141592653589793;
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void SetRaio(double raioCirculo) {
		this.raio = raioCirculo;
	}
	
	@Override
	public double getArea() {
		return pi * (raio * raio);
	}

	@Override public String getDescricao() {
		return getNome() + " é um circulo de raio " + raio;
	}
}