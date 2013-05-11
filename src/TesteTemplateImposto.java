

public class TesteTemplateImposto {

	public static void main(String[] args) {
		
		
		Orcamento orcamento = new Orcamento(500);
		
		Item item1 = new Item("LAPIS",100.1);
	
		Item item2 = new Item("CANETA",99);
	
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		
		Imposto icpp = new ICPP();
		Imposto ikcv = new IKCV();
		
		double calcula = icpp.calcula(orcamento);
		
		double calcula2 = ikcv.calcula(orcamento);
		
		System.out.println(calcula);
		
		System.out.println(calcula2);
	}
}
