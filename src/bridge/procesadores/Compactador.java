package bridge.procesadores;

import bridge.PosProcessador;


public class Compactador implements PosProcessador {
    @Override
    public String processar(String conteudo) {
        return conteudo.charAt(0) + "";
    }
}
