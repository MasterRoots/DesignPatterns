public class Negativa implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Conta Negativa");

	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.95;
	    if(conta.saldo > 0) conta.estadoDaConta = new Positiva();

	}

}
