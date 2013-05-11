import java.util.List;

public class RelatorioComplexo extends TemplateReport {

	@Override
	protected void header(Banco banco) {
		System.out.println(banco.getNome() + " Endere�o: "
				+ banco.getEndereco() + " telefone: " + banco.getTelefone());

	}

	@Override
	protected void footer(Banco banco) {
		System.out.println("e-mail: " + banco.getEmail() + " Data: "
				+ banco.getData().getTime().toString());
	}

	@Override
	protected void body(List<Conta> contas) {
		for (Conta conta : contas) {

			System.out.println("Titular: " + conta.getNome() + "\tAg�ncia: "
					+ conta.getAgencia() + "\tN�nero Conta: "
					+ conta.getNumeroConta() + "\tSaldo: " + conta.getSaldo());
		}
	}

}
