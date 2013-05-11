import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class TestaFiltro {
	public static void main(String[] args) {

		List<Conta> contas = new ArrayList<Conta>();

		List<Conta> contasFiltradas = new ArrayList<Conta>();

		Conta conta1 = new Conta();
		conta1.setSaldo(700000);

		Conta conta2 = new Conta();
		conta2.setSaldo(60);

		Conta conta3 = new Conta();
		conta3.setSaldo(249);

		Conta conta4 = new Conta();
		conta4.setSaldo(248);
		conta4.setDataAbertura(new GregorianCalendar());

		contas.add(conta1);
		contas.add(conta2);
		contas.add(conta3);
		contas.add(conta4);

		Filtro filtro = new FiltroSaldoMenor(new FiltroSaldoMaior(
				new FiltroDataAbertura()));

		contasFiltradas = filtro.filtra(contas);

		for (Conta conta : contasFiltradas) {
			System.out.println(conta.getSaldo());
		}
	}
}
