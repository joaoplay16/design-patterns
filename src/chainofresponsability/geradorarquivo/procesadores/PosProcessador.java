package chainofresponsability.geradorarquivo.procesadores;

public abstract class PosProcessador {

	/* A classe PosProcessador possui o atributo proximo de seu próprio tipo*/
	private PosProcessador proximo;


	public PosProcessador(PosProcessador prox) {
		proximo = prox;
	}

	/** Caso seja o final da cadeia, o construtor
	 * vazio pode ser invocado, o qual irá configurar um Null Object no atributo proximo
	 **/
	public PosProcessador() {
		/*
		Se a instância atual não for uma instância de PosProcessadorNulo crie uma nova.
		Verificao necessária para evitar recursividade infinita.
		*/
	  	if(!(this instanceof PosProcessadorNulo)) proximo = new PosProcessadorNulo();
	}

	public String processarCadeia(String conteudo) {
		System.out.println("prox is null? " + (proximo == null));
		/*sera null quando for instancia de PosProcessadorNulo(),
		* pois ele não possui instancia para o próximo pós-processador.
		* */

		if(proximo == null) return conteudo;

		conteudo = processar(conteudo);
		return proximo.processarCadeia(conteudo);
	}

	/*O método abstrato processar() representa a lógica de processa-
	mento específica daquela implementação que será invocada durante a execução da
	cadeia e, por ele não poder ser invocado de fora, a sua visibilidade é protected.
*/
	protected abstract String processar(String conteudo);
}