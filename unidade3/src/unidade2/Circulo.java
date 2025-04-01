package unidade2;

public class Circulo extends FiguraGeometrica{
	private double raio;
	private static final double pi =  3.141592653589793;
	
	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return pi * (raio * raio);
	}

	@Override public String getDescricao() {
		return "A figura criada é um circulo de raio " + raio;
	}
}