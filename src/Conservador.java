public class Conservador implements Investimento {

	@Override
	public double calcula(Conta conta) {

		double saldo = conta.getSaldo();
		double resultado = (saldo * 0.008) * 0.75;

		conta.setSaldo(saldo + resultado);

		return conta.getSaldo();
	}

}
