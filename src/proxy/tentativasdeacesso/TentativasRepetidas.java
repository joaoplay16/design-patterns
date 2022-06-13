package proxy.tentativasdeacesso;

import java.io.IOException;

/*
* Para diminuir o número de falhas, uma alternativa é realizar tentativas repetidas
de acesso ao arquivo. Como a classe não pode ser modificada e não é desejável mo-
dificar as classes que buscam o arquivo, uma alternativa é a criação de um Proxy
que tente buscar o arquivo novamente no caso de uma falha. Na listagem a seguir
é apresentada a classe TentativasRepetidas que encapsula uma instância do
tipo AcessoRemoto. O método buscarArquivo() invoca o mesmo método no
objeto que está sendo encapsulado, porém dentro de um bloco try/catch onde
um possível erro é capturado incrementando o número de tentativas. Sendo assim, o
método é invocado novamente até que nenhum erro seja retornado ou que o número
limite de tentativas seja atingido.
*/
public class TentativasRepetidas implements AcessoRemoto{
	private AcessoRemoto ar;
	private int maximoTentativas;

	public TentativasRepetidas(AcessoRemoto ar, int maximoTentativas) {
		this.ar = ar;
		this.maximoTentativas = maximoTentativas;
	}
	public byte[] buscarArquivo(String url) throws IOException {
		int tentativas = 0;
		IOException ultimoErro = null;
		while (tentativas < maximoTentativas) {
			try {
				return ar.buscarArquivo(url);
			} catch (IOException ex) {
				tentativas++;
				ultimoErro = ex;
			}
		}
		throw ultimoErro;
	}
}