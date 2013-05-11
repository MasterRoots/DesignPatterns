public class ItemDaNotaBuilder {

	private String nome;
	private double valor;

	public ItemDaNotaBuilder paraNome(String nome) {
		this.nome = nome;
		return this;

	}

	public ItemDaNotaBuilder paraValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemDaNota constroi(){
		
		return new ItemDaNota(nome, valor);
	}

}
