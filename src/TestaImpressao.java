public class TestaImpressao {

	public static void main(String[] args) {

		ChainRespImpressao sistema = new ChainRespImpressao();

		Conta conta = new Conta();

		conta.setNome("Rodrigo");
		conta.setSaldo(100.0);

		Requisicao requisicaoXML = new Requisicao(Formato.XML);

		Requisicao requisicaoCSV = new Requisicao(Formato.CSV);

		Requisicao requisicaoPorcento = new Requisicao(Formato.PORCENTO);

		String infoXML = sistema.defineImpressao(requisicaoXML, conta);

		System.out.println(infoXML);

		String infoCSV = sistema.defineImpressao(requisicaoCSV, conta);

		System.out.println(infoCSV);

		String infoPorcento = sistema
				.defineImpressao(requisicaoPorcento, conta);

		System.out.println(infoPorcento);

	}
}
