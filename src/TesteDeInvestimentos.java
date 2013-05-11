public class TesteDeInvestimentos {
	public static void main(String[] args) {

		Conta conta = new Conta();

		conta.setSaldo(100);

		Investimento conservador = new Conservador();

		Investimento moderado = new Moderado();

		Investimento arrojado = new Arrojado();

		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

		realizadorDeInvestimentos.realizaInvestimento(conta, conservador);

		conta.setSaldo(100);

		realizadorDeInvestimentos.realizaInvestimento(conta, moderado);

		conta.setSaldo(100);

		realizadorDeInvestimentos.realizaInvestimento(conta, arrojado);

	}

}
