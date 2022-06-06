package chainofresponsability;

import chainofresponsability.geradorarquivo.GeradorPropriedades;
import chainofresponsability.geradorarquivo.procesadores.Compactador;
import chainofresponsability.geradorarquivo.procesadores.Criptografador;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main (String[] args){
        Compactador compactador = new Compactador();
        //criptografa depois compacta
        Criptografador criptografador = new Criptografador(compactador);

        GeradorPropriedades geradorPropriedades = new GeradorPropriedades();
        geradorPropriedades.setProcessador(criptografador);

        Map<String, Object> propriedades = new HashMap<>();
        propriedades.put("1","um");
        propriedades.put("2","dois");

        geradorPropriedades.gerarConteudo(propriedades);

        geradorPropriedades.gerarArquivo("arquivo.properties", propriedades);
    }
}
