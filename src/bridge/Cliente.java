package bridge;

import bridge.procesadores.Compactador;
import bridge.procesadores.Criptografador;
import bridge.procesadores.ProcessadorNulo;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main (String[] args){
        Compactador compactador = new Compactador();
        Criptografador criptografador = new Criptografador();

        GeradorPropriedades geradorPropriedades = new GeradorPropriedades();
        geradorPropriedades.setProcessador(compactador);

        GeradorXML geradorXML = new GeradorXML();
        geradorXML.setProcessador( new ProcessadorNulo());

        Map<String, Object> propriedades = new HashMap<>();
        propriedades.put("1","um");
        propriedades.put("2","dois");

        //trocando implementação em tempo de execução
//        geradorPropriedades.setProcessador(criptografador);

        geradorPropriedades.gerarConteudo(propriedades);
        geradorXML.gerarConteudo(propriedades);

        geradorPropriedades.gerarArquivo("arquivo.properties", propriedades);
        geradorXML.gerarArquivo("arquivo.xml", propriedades);
    }
}
