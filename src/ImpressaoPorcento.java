public class ImpressaoPorcento implements Impressao {

	private Impressao proxima;

	public ImpressaoPorcento(Impressao impressao) {
		proxima = impressao;

	}

	public ImpressaoPorcento() {
		proxima = null;

	}

	@Override
	public String imprime(Requisicao requisicao, Conta conta) {

		StringBuilder dados = new StringBuilder();
		if (requisicao.getFormato().equals(Formato.PORCENTO)) {

			dados.append(conta.getNome());
			dados.append("%");
			dados.append(conta.getSaldo());
			dados.append("%");

			return dados.toString();
		} else if (proxima != null) {
			return proxima.imprime(requisicao, conta);
		} else {
			throw new RuntimeException("Formato Desconhecido");
		}

	}

}
