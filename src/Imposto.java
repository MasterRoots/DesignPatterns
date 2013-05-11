public abstract class Imposto {

	protected Imposto outroImspoto;

	public Imposto(Imposto outroImposto) {
		outroImspoto = outroImposto;
	}

	public Imposto() {
	}

	public abstract double calcula(Orcamento orcamento);
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImspoto == null) {
			return 0;
		}
		return outroImspoto.calcula(orcamento);
	}
}
