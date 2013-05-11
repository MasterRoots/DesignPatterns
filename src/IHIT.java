import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateDeImpostoCondicional {

	public IHIT() {
		// TODO Auto-generated constructor stub
	}

	public IHIT(Imposto outroImposto) {
		super(outroImposto);
	}

	private boolean temItensDoMesmoNome(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}

		return false;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.01) * orcamento.getItens().size();
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return (orcamento.getValor() * 0.13) + 100;
	}

	@Override
	public boolean deveUsarMaxinaTaxacao(Orcamento orcamento) {
		return temItensDoMesmoNome(orcamento);
	}

}
