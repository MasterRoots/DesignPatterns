
public class ChainRespImpressao {
	
	public String defineImpressao(Requisicao requisicao, Conta conta){
		
		Impressao imprimeNada = new ImprimeNada();
		
		Impressao impressaoPorcento = new ImpressaoPorcento(imprimeNada);

		Impressao impressaoCSV = new ImpressaoCSV(impressaoPorcento);
		
		Impressao impressaoXML = new ImpressaoXML(impressaoCSV);

		
		return impressaoXML.imprime(requisicao, conta);
		
	}
}
