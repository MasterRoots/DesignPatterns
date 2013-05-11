
public class Positiva implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		conta.saldo -= valor;
		if(conta.saldo < 0 ){
			conta.estadoDaConta = new Negativa();
		}
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.saldo += valor * 0.98;
		
	}

}
