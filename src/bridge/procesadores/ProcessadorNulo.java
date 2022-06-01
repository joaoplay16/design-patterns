package bridge.procesadores;

import bridge.PosProcessador;

//não faz nada, evita nullPointerException e uso de condicionais
public class ProcessadorNulo implements PosProcessador {
    @Override
    public String processar(String conteudo) {
        return conteudo;
    }
}
