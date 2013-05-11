
public class SemDesconto extends TemplateDesconto{

	@Override
	public boolean validaCondicao(Orcamento orcamento) {
		return true;
	}

	@Override
	public double retornaDesconto(Orcamento orcamento) {
		return 0;
	}



}
