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
		Se a instancia atual não for uma instancia de PosProcessadorNulo crie uma nova.
		Verificao necessária pra evitar looping infinito de recursividade
		*/
	  	if(!(this instanceof PosProcessadorNulo)) proximo = new PosProcessadorNulo();
	}

	public String processarCadeia(String conteudo) {
		if(proximo == null) return conteudo;

		conteudo = processar(conteudo);
		return proximo.processarCadeia(conteudo);
	}

	/*O método abstrato processar() representa a lógica de processa-
	mento específica daquela implementação que será invocada durante a execução da
	cadeia e, por ele não poder ser invocado de fora, sua visibilidade é protected.
*/
	protected abstract String processar(String conteudo);
}