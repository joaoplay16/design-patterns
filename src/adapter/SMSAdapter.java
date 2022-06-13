package adapter;

/*
Nesse padrão a classe intermediária é utilizada para encapsular uma classe com uma
interface diferente dasua. Nesse caso, a ideia é justamente permitir que uma classe
com uma determinada interface possa ser utilizada por outra que sabe interagir com
classes com interface diferente.

* Para evitar que as classes cliente precisem ser alteradas e se acoplarem a uma
nova API, decidiu-se criar um Adapter para traduzir as chamadas de uma interface
para outra.
* */
public class SMSAdapter implements SMSSender {
	private EnviadorSMS env; // nova interface

	public SMSAdapter(EnviadorSMS env) {
		this.env = env;
	}
	public boolean sendSMS(SMS sms) {
		String dest = sms.getDestino();
		String orig = sms.getOrigem();
		String[] txts = quebrarMsgs(sms.getTexto());
		try {
			env.enviarSMS(dest, orig, txts);
		} catch (SMSException e) {
			return false;
		}
		return true;
	}

	/*O método quebrarMsgs() é chamado para quebrar
	o texto da mensagem que está em apenas uma string em um array strings com ta-
	manho máximo de 160 caracteres.*/
	private String[] quebrarMsgs(String text){
		int size = text.length();
		int qtd = (size%160==0)? size/160: size/160+1;
		String[] msgs = new String[qtd];
		for(int i=0; i<qtd; i++){
			int min = i*160;
			int max = (i==qtd-1)? size: (i+1)*160;
			msgs[i] = text.substring(min,max);
		}
		return msgs;
	}
}
