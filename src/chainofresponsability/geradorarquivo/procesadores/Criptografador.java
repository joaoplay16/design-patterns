package chainofresponsability.geradorarquivo.procesadores;

public class Criptografador extends PosProcessador {

    public Criptografador() {}

    public Criptografador(PosProcessador prox) {
        super(prox);
    }

    @Override
    public String processar(String conteudo) {
        return new StringBuilder(conteudo).reverse().toString();
    }
}
