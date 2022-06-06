package chainofresponsability.geradorarquivo.procesadores;


public class Compactador extends PosProcessador {

    public Compactador (){}

    public Compactador(PosProcessador prox) {
        super(prox);
    }

    @Override
    public String processar(String conteudo) {
        return conteudo + ".zip";
    }
}
