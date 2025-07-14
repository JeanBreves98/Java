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