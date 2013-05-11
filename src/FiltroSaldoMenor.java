public class FiltroSaldoMenor extends TemplateFiltro {

	public FiltroSaldoMenor() {
		// TODO Auto-generated constructor stub
	}

	public FiltroSaldoMenor(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public boolean validaFiltro(Conta conta) {
		return conta.getSaldo()	<= 100 ;
	}

}