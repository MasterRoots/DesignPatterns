import java.util.List;

public abstract class TemplateFiltro extends Filtro {

	public TemplateFiltro() {
		// TODO Auto-generated constructor stub
	}

	public TemplateFiltro(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {

		for (Conta conta : contas) {
			if (validaFiltro(conta)) {
				adicionaContaAoFiltro(conta);
			}
		}
		
		getContas().addAll(realizaOutroFiltro(contas));
		return getContas();
	}

	public abstract boolean validaFiltro(Conta conta);

}
