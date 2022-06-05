package factory;

import java.util.ArrayList;
import java.util.List;

public class ClasseConcreta extends ClasseAbstrata<String> {

    private List<String> listaDeStrings;

    //metodo fabrica
    @Override
    public List<String> getList() {
        if( listaDeStrings == null){
            listaDeStrings = new ArrayList<>();
        }
        return listaDeStrings;
    }

    // implementação opcional
    @Override
    public void addToList(String string) {
        string += " é bom";

        List<String> lista = getList();

        lista.add(string);
    }
}
