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