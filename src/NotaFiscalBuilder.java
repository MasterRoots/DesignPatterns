import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;

	private String cnpj;

	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();

	private double valorBruto;

	private double impostos;

	private String observacoes;

	private Calendar data;

	List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
		this.todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}

	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		this.data = Calendar.getInstance();
		this.todasAcoesASeremExecutadas = acoes;
	}

	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);

	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);

		valorBruto += item.getValor();

		impostos += item.getValor() * 0.05;

		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;

	}

	public NotaFiscalBuilder naDataAtual(Calendar dataAtual) {
		this.data = dataAtual;

		return this;
	}

	public NotaFiscal constroi() {

		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto,
				impostos, todosItens, observacoes);

		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);

		}
		return nf;
	}

}
