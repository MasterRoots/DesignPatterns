public abstract class TemplateDesconto implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if(validaCondicao(orcamento)){
			return retornaDesconto(orcamento);
		}else{
			return proximo.desconta(orcamento);
		}

	}
	
	@Override
	public void setProximo(Desconto desconto){
		this.proximo = desconto;
		
	}

	public abstract boolean validaCondicao(Orcamento orcamento);

	public abstract double retornaDesconto(Orcamento orcamento);
	
	
}
