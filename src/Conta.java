import java.util.Calendar;

public class Conta {

	private String nome;

	protected double saldo;

	private String agencia;

	private String numeroConta;

	private Calendar dataAbertura;

	protected EstadoDaConta estadoDaConta = new Positiva();

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void saca(double valor) {
		estadoDaConta.saca(this, valor);
	}

	public void deposita(double valor) {
		estadoDaConta.deposita(this, valor);
	}

}
