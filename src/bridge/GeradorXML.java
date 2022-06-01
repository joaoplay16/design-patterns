package bridge;

import java.util.Map;

public class GeradorXML extends GeradorArquivo {

    @Override
    public String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder propFileBuilder = new StringBuilder();
        propFileBuilder.append("<properties>");
        for(String prop : propriedades.keySet()){
            propFileBuilder.
                    append("<"+prop+">"+propriedades.get(prop)+"</"+prop+">");
        }
        propFileBuilder.append("</properties>");
        return propFileBuilder.toString();
    }
}
