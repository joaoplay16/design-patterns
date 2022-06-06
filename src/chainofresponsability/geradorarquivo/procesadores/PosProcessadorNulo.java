package chainofresponsability.geradorarquivo.procesadores;

//não faz nada, evita nullPointerException e uso de condicionais
public class PosProcessadorNulo extends PosProcessador {
    public String processar(String conteudo) {
        return conteudo;
    }
}
