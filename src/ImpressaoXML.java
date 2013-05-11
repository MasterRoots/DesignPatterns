public class ImpressaoXML implements Impressao {

	private Impressao proxima;

	public ImpressaoXML(Impressao impressao) {
		this.proxima = impressao;
	}

	@Override
	public String imprime(Requisicao requisicao, Conta conta) {

		StringBuilder dados = new StringBuilder();

		if (requisicao.getFormato().equals(Formato.XML)) {

			dados.append("<conta>\n");
			dados.append("\t<nome>" + conta.getNome() + "<\\nome>\n");
			dados.append("\t<saldo>" + conta.getSaldo() + "<\\saldo>\n");
			dados.append("<\\conta>");
			return dados.toString();
		} else {
			return proxima.imprime(requisicao, conta);
		}

	}

}
