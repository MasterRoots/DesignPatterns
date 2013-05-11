public class DescontoPorMaisDeQuinhentosReais extends TemplateDesconto {

	@Override
	public boolean validaCondicao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	@Override
	public double retornaDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

}
