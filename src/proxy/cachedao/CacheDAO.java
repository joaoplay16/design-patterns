package proxy.cachedao;

import java.util.HashMap;
import java.util.Map;

/*A seguir é apresentada a implementação da classe CacheDAO. Ele possui um mapa
que é utilizado para armazenar os objetos persistidos a partir do seu identificador.
Os métodos salvar() e excluir() respectivamente adicionam e removem os
objetos do mapa, mas apenas após delegar a chamada à classe que está encapsulando.

Dessa forma, o método recuperar() primeiro verifica se o objeto está no ca-
che e em caso positivo o retorna sem invocar o DAO encapsulado. Caso o objeto não
esteja no cache, o DAO é então invocado e o objeto encapsulado é armazenado no
cache antes de ser retornado. Observe que nesse exemplo o Proxy pode, em alguns
casos, retornar para o cliente sem nem invocar o método do objeto encapsulado.

*/
public class CacheDAO implements DAO {
	private DAO dao;
	private Map<Integer, Identificavel> cache;

	public CacheDAO(DAO dao) {
		this.dao = dao;
		this.cache = new HashMap<>();
	}

	public Identificavel recuperar(int id) {
		if (cache.containsKey(id))
			return cache.get(id);
		Identificavel obj = dao.recuperar(id);
		cache.put(id, obj);
		return obj;
	}

	public void excluir(int id) {
		dao.excluir(id);
		cache.remove(id);
	}

	public void salvar(Identificavel obj) {
		dao.salvar(obj);
		cache.put(obj.getId(), obj);
	}
}