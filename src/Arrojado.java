import java.util.Random;

public class Arrojado implements Investimento {

	@Override
	public double calcula(Conta conta) {
		double resultado;

		double porcentagem;

		double saldo = conta.getSaldo();

		double chance = new Random().nextDouble();
		
		if (chance < 0.20) {
			porcentagem = 0.05;
		} else if (chance < 0.30) {
			porcentagem = 0.03;
		} else {
			porcentagem = 0.006;
		}

		resultado = (saldo * porcentagem) * 0.75;

		conta.setSaldo(saldo + resultado);

		return conta.getSaldo();
	}

}
