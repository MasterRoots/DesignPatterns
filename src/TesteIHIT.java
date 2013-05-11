
public class TesteIHIT {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500);
		
		Item item1 = new Item("LAPIS",100);
		Item item2 = new Item("CANETA",150);
		Item item3 = new Item("CANETA",100);
		
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		orcamento.adicionaItem(item3);
	
		
		Imposto ihit = new IHIT();
		
		double calcula = ihit.calcula(orcamento);
		
		System.out.println(calcula);
		
		Orcamento orcamento2 = new Orcamento(500);
		
		orcamento.adicionaItem(item1);
		
		double calcula2 = ihit.calcula(orcamento2);
		
		System.out.println(calcula2);
	}
	
	
}
