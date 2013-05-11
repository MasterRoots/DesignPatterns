public class ImpressaoCSV implements Impressao {

	private Impressao proxima;

	public ImpressaoCSV(Impressao impressao) {
		proxima = impressao;
	}

	@Override
	public String imprime(Requisicao requisicao, Conta conta) {

		StringBuilder dados = new StringBuilder();

		if (requisicao.getFormato().equals(Formato.CSV)) {

			dados.append(conta.getNome());
			dados.append(";");
			dados.append(conta.getSaldo());
			dados.append(";");

			return dados.toString();

		} else {
			return proxima.imprime(requisicao, conta);
		}
	}

}
