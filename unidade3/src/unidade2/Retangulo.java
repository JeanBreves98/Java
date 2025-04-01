package unidade2;

public class Retangulo extends FiguraGeometrica {
	private double base, altura;
	
	public Retangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double getArea() {
		return base  * altura;
	}
	
	@Override public String getDescricao() {
		return "A figura criada é um retângulo de base " + base + "e de altura " + altura;
	}
}
