public class DescontoPorVendaCasada extends TemplateDesconto {

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	@Override
	public boolean validaCondicao(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	@Override
	public double retornaDesconto(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

}
