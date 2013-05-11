import java.util.Random;

public class Moderado implements Investimento {

	@Override
	public double calcula(Conta conta) {

		double resultado;

		double porcentagem;

		double saldo = conta.getSaldo();

		double chance = new Random().nextDouble();

		if (chance > 0.50) {
			porcentagem = 0.025;
		} else {
			porcentagem = 0.007;
		}

		resultado = (saldo * porcentagem) * 0.75;

		conta.setSaldo(saldo + resultado);

		return conta.getSaldo();
	}

}
