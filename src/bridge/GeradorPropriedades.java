package bridge;

import java.util.Map;

public class GeradorPropriedades extends GeradorArquivo {

    @Override
    public String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        for(String prop : propriedades.keySet()){
            propFileBuilder.append(prop+"="+propriedades.get(prop)+"\n");
        }
        return propFileBuilder.toString();
    }
}
