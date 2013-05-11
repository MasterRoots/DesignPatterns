public abstract class TemplateDeImpostoCondicional extends Imposto {
	
	public TemplateDeImpostoCondicional() {
		// TODO Auto-generated constructor stub
	}
	
	public TemplateDeImpostoCondicional(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaxinaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}

	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaxinaTaxacao(Orcamento orcamento);

}
