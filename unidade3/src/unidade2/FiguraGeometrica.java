package unidade2;

public abstract class FiguraGeometrica {
	private String nome;
	
	public FiguraGeometrica(String nome) {
		this.nome = nome;
	}

	public abstract double getArea();

	public abstract String getDescricao();
	
}