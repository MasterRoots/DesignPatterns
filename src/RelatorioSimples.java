import java.util.List;

public class RelatorioSimples extends TemplateReport {

	@Override
	protected void header(Banco banco) {
		System.out
				.println(banco.getNome() + "Telefone: " + banco.getTelefone());

	}

	@Override
	protected void footer(Banco banco) {
		System.out
				.println(banco.getNome() + "Telefone: " + banco.getTelefone());

	}

	@Override
	protected void body(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Cliente: " + conta.getNome() + "\t" + "saldo: "
					+ conta.getSaldo() + "\n");
		}
	}

}
