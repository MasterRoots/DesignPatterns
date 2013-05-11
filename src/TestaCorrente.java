public class TestaCorrente {

	public static void main(String[] args) {

		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(300.0);

		orcamento.adicionaItem(new Item("CANETA", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 200.0));

		double descontoFinal = descontos.calcula(orcamento);

		// TRUE
		System.out.println(descontoFinal);

		orcamento = new Orcamento(100.0);

		orcamento.adicionaItem(new Item("LAPIS", 100.0));

		descontoFinal = descontos.calcula(orcamento);

		// FALSE
		System.out.println(descontoFinal);

	}
}
