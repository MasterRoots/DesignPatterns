import java.util.Calendar;

public class FiltroDataAbertura extends TemplateFiltro {

	public FiltroDataAbertura() {
		// TODO Auto-generated constructor stub
	}

	public FiltroDataAbertura(Filtro outroFiltro) {
		super(outroFiltro);
	}

	@Override
	public boolean validaFiltro(Conta conta) {
		return  conta.getDataAbertura() !=null && conta.getDataAbertura().get(Calendar.MONTH) == (Calendar
				.getInstance().get(Calendar.MONTH));

	}

}
