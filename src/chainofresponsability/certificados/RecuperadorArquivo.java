package chainofresponsability.certificados;

/*
Cada subclasse de RecuperadorArquivo deve implementar o método
recuperaArquivo() buscando o arquivo em uma fonte diferente.*/

public abstract class RecuperadorArquivo {
	private RecuperadorArquivo proximo; // esse padrão usa recursividade

	public RecuperadorArquivo(RecuperadorArquivo proximo) {
		this.proximo = proximo;
	}

	/*O método recuperar() da classe RecuperadorArquivo implementa
	  uma lógica comum aos elementos da cadeia de execução e delega os
	  pontos variáveis a hook methods que serão implementados pelas sub-
	  classes. */
	public Arquivo recuperar(String nome) { // Template Method!
		Arquivo a = recuperaArquivo(nome);
		if (a == null || !a.isValido())
			return chamarProximo(nome);
		else
			return a;
	}

	/*chamado pelo Template Method
	  apesar de nao ser abstrato, também pode ser considerado um hook method.*/
	protected Arquivo chamarProximo(String nome) {
		if (proximo == null)
			throw new RuntimeException("Não foi possível " +
					" recuperar o arquivo");
		return proximo.recuperar(nome);
	}

	//hook method
	protected abstract Arquivo recuperaArquivo(String nome);
}