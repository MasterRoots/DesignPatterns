public class DescontoPorCincoItens extends TemplateDesconto {

	@Override
	public boolean validaCondicao(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}

	@Override
	public double retornaDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
