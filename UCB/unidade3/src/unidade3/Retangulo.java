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
