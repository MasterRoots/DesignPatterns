public class Aprovado implements EstadoDeUmOrcamento {

	//Mais um teste
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {

		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto extra j� aplicado");
		}

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� est� aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException(
				"Or�amentos aprovados n�o podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
}
