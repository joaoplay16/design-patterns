package bridge.procesadores;

import bridge.PosProcessador;

public class Criptografador implements PosProcessador {
    @Override
    public String processar(String conteudo) {
        return new StringBuilder(conteudo).reverse().toString();
    }
}
