package proxy.cachedao;
//Interface que define os serviços de um trecho aéreo
public interface DAO {
	public Identificavel recuperar(int id);
	public void excluir(int id);
	public void salvar(Identificavel obj);
}
