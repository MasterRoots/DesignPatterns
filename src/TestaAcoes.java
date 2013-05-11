import java.util.ArrayList;
import java.util.List;

public class TestaAcoes {

	public static void main(String[] args) {
		
		List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>();
		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDAO());
		acoes.add(new EnviadorDeEmail());
		acoes.add(new Impressora());
		acoes.add(new Multiplicador(2));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("1234")
				.comItem(new ItemDaNota("Item 1", 100)).comObservacoes("obs")
				.constroi();

		System.out.println(nf.getValorBruto());
	}

}
