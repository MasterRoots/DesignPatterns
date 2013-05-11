public class IKCV extends TemplateDeImpostoCondicional {
	
	public IKCV() {
		// TODO Auto-generated constructor stub
	}
	
	public IKCV(Imposto outroImposto){
		super(outroImposto);
	}

	private boolean temItermmaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor() > 100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public boolean deveUsarMaxinaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItermmaiorQue100ReaisNo(orcamento);
	}
}
