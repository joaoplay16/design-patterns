package proxy.assincrono;

/*
A classe ProxyAssincrono apresen-
tada a seguir encapsula uma transação e a invocasse de forma assíncrona.
Ele pode ser utilizado em qualquer implementação de Transacao, evitando
a duplicação, e inclusive a mesma classe pode ser utilizada com ou sem
o Proxy.
*/
public class ProxyAssincrono implements Transacao{
	private Transacao t;
	public ProxyAssincrono(Transacao t) {
		this.t = t;
	}
	public void executar() {
		Runnable r = new Runnable(){
			public void run() {
				t.executar();
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}