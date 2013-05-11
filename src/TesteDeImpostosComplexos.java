
public class TesteDeImpostosComplexos {

	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		
		Orcamento orcamento = new Orcamento(500);
		
		double calcula = iss.calcula(orcamento);
		
		System.out.println(calcula);
		
		
		Imposto icpp = new ICPP(new ICMS());
		
		double calcula2 = icpp.calcula(orcamento);
		
		System.out.println(calcula2);
		
	}
}
