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