package chainofresponsability.certificados;

import java.util.HashMap;
import java.util.Map;

public class RecuperadorCacheMemoria extends RecuperadorArquivo {
    private Map<String, Arquivo> cache = new HashMap<>();

    public RecuperadorCacheMemoria(RecuperadorArquivo proximo) {
        super(proximo);
    }

    /*
    O método recuperaArquivo() verifica se existe o
    arquivo no mapa e retorna nulo caso não exista.

	pode-se perceber como ele pode ser sobres-
	crito pela subclasse para a adição da funcionalidade. */
	@Override
    protected Arquivo recuperaArquivo(String nome) {
        if (cache.containsKey(nome))
            return cache.get(nome);
        return null;
    }

    /*Para armazenar novos arquivos no mapa, o método chamarProximo()
     também é implementado para permitir que se tenha acesso ao arquivo
     retornado pelo próximo.
*/
	@Override
    protected Arquivo chamarProximo(String nome) {
        Arquivo a = super.chamarProximo(nome);
        cache.put(nome, a);
        return a;
    }
}