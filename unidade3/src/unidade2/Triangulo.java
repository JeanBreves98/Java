package unidade2;

public class Triangulo extends FiguraGeometrica{
	private double base, altura;
	
		public Triangulo(String nome, double base, double altura) {
			super(nome);
			this.base = base;
			this.altura = altura;
		}
	
		@Override
		public double getArea() {
			return (base  * altura) / 2;
		}
	
		@Override public String getDescricao() {
			return "A figura criada é um triangulo de base " + base + "e de altura " + altura;
		}
}