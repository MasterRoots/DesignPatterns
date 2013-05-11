import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TestaRelatorio {

	public static void main(String[] args) {

		Banco banco = new Banco();

		banco.setNome("Banco Nosso");
		banco.setEmail("atendimento@banconosso.com.br");
		banco.setEndereco("Rua dos Mariscos, 8372");
		banco.setTelefone("11 6666-8888");
		Calendar calendar = new GregorianCalendar();
		banco.setData(calendar);
		
		Conta conta1 = new Conta();
		
		conta1.setAgencia("1234");
		conta1.setNome("Rodrigo Braga");
		conta1.setNumeroConta("12345-x");
		conta1.setSaldo(1000);
		
		Conta conta2 = new Conta();
		
		conta2.setAgencia("7777");
		conta2.setNome("Priscila");
		conta2.setNumeroConta("7373-0");
		conta2.setSaldo(2000);
		
		List<Conta> contas = new ArrayList<Conta>();
		
		contas.add(conta1);
		contas.add(conta2);
		
		
		Report relatorioSimples = new RelatorioSimples();
		
		Report relatorioComplexo = new RelatorioComplexo();
		
		relatorioSimples.imprime(contas, banco);
		
		relatorioComplexo.imprime(contas, banco);
		
		
		
	}
}
