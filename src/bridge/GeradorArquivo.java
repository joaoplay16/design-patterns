package bridge;

import java.util.Map;

public abstract class GeradorArquivo {
    private PosProcessador posProcessador;

    public final void setProcessador(PosProcessador posProcessador){
        this.posProcessador = posProcessador;
    }

    public final void gerarArquivo(String nome, Map<String, Object> propriedades){
        System.out.println("Arquivo: " + nome);

        String conteudo = gerarConteudo(propriedades);

        System.out.println("Conteudo do arquivo: " + posProcessador.processar(conteudo));
    }

    public abstract String gerarConteudo(Map<String, Object> propriedades);
}
