public class RealizadorDeInvestimentos {

	public void realizaInvestimento(Conta conta, Investimento investimento) {

		double resultado = investimento.calcula(conta);

		System.out.println(resultado);
	}
}
