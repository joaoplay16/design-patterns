package chainofresponsability.geradorarquivo;

import chainofresponsability.geradorarquivo.procesadores.PosProcessador;

import java.util.Map;

/*
*Um ponto que acho interessante no Bridge é o fato de sua solução utilizar ao
mesmo tempo herança e composição
* */

public abstract class GeradorArquivo {
    /*o metodo processar esta na instancia de PosProcessador. Dessa forma
      qualquer implementacao dessa interface pode ser utilizada para realizar
    * o pos-processamento do arquivo.

        o processador pode ser configurado independente da subclasse que esta
        sendo utlizada, permitindo variar de forma independente
    */
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
