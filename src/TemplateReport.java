import java.util.List;

public abstract class TemplateReport implements Report{
	
	@Override
	public void imprime(List<Conta> contas, Banco banco){
		
		header(banco);
		
		body(contas);
		
		header(banco);
	}
	
	protected abstract void header(Banco banco);
	
	protected abstract void footer(Banco banco);
	
	protected abstract void body(List<Conta> contas);
	
}
