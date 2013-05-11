public class ICCC extends Imposto {
	
	public ICCC() {
		// TODO Auto-generated constructor stub
	}
	
	public ICCC(Imposto outroImposto){
		super(outroImposto);
	}

	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.05;
		} else if (orcamento.getValor() >= 1000 && orcamento.getValor() <= 3000) {
			return orcamento.getValor() * 0.07;
		} else if (orcamento.getValor() > 3000) {
			return (orcamento.getValor() * 0.08) + 30;
		}

		return 0;
	}

}
