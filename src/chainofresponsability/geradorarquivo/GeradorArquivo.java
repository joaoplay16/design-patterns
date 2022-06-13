package chainofresponsability.geradorarquivo;

import chainofresponsability.geradorarquivo.procesadores.PosProcessador;

import java.util.Map;


public abstract class GeradorArquivo {

    private PosProcessador posProcessador; //compõe a classe GeradorArquivo

    public final void setProcessador(PosProcessador posProcessador){
        this.posProcessador = posProcessador;
    }

    public final void gerarArquivo(String nome, Map<String, Object> propriedades){
        System.out.println("Arquivo: " + nome);

        String conteudo = gerarConteudo(propriedades);

        System.out.println("Conteudo do arquivo: " + posProcessador.processarCadeia(conteudo));
    }

    public abstract String gerarConteudo(Map<String, Object> propriedades);
}
