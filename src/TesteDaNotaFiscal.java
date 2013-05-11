import java.util.Calendar;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {

		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		
		ItemDaNotaBuilder itemBuilder = new ItemDaNotaBuilder();
		
		itemBuilder.paraNome("Item 1").paraValor(200.0).paraNome("item 2").paraValor(300.0).paraNome("Item 3").paraValor(400.0);
		
		ItemDaNota itemDaNota = itemBuilder.constroi();

		builder.paraEmpresa("Caelum Ensino e Inovação")
		.comCnpj("12.345.678/0001-12")
		.comItem(itemDaNota)
		.comObservacoes("observacoes")
		.naDataAtual(Calendar.getInstance());
		
		/*builder.paraEmpresa("Caelum Ensino e Inovação")
		.comCnpj("12.345.678/0001-12")
		.comItem(new ItemDaNota("Item 1", 200.0))
		.comItem(new ItemDaNota("Item 2", 300.0))
		.comItem(new ItemDaNota("Item 3", 400.0))
		.comObservacoes("observacoes")
		.naDataAtual();*/
		
		NotaFiscal nf = builder.constroi();
		System.out.println(nf.getValorBruto());
		
	}
}
