public class ICPP extends TemplateDeImpostoCondicional {
	
	public ICPP() {
		// TODO Auto-generated constructor stub
	}
	
	public ICPP(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaxinaTaxacao(Orcamento orcamento) {

		return orcamento.getValor() < 500;
	}

}
