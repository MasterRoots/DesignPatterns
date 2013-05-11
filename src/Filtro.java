import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected Filtro outroFiltro;

	private List<Conta> contasFiltradas = new ArrayList<Conta>();

	public List<Conta> getContas() {
		return contasFiltradas;
	}

	public Filtro() {
		// TODO Auto-generated constructor stub
	}

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public abstract List<Conta> filtra(List<Conta> contas);

	protected void adicionaContaAoFiltro(Conta conta) {
		contasFiltradas.add(conta);
	}
	
	protected List<Conta> realizaOutroFiltro(List<Conta>contas){
		if (outroFiltro==null) {
			return new ArrayList<Conta>();
		}else{
			return outroFiltro.filtra(contas);
		}
	}

}
