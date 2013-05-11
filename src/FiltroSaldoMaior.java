public class FiltroSaldoMaior extends TemplateFiltro {

	public FiltroSaldoMaior() {
		// TODO Auto-generated constructor stub
	}

	public FiltroSaldoMaior(Filtro outrofilFiltro) {
		super(outrofilFiltro);
	}

	@Override
	public boolean validaFiltro(Conta conta) {
		return conta.getSaldo() >= 500000;

	}

}
