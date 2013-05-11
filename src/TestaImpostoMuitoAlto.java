
public class TestaImpostoMuitoAlto {
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(500);
		
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ISS());
		
		double calcula = impostoMuitoAlto.calcula(orcamento);
		
		System.out.println(calcula);
	}

}
