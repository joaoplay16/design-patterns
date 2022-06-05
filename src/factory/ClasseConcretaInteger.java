package factory;

import java.util.ArrayList;
import java.util.List;

//Classe que especializa funcionalidades especificas
public class ClasseConcretaInteger extends ClasseAbstrata<Integer> {

    private List<Integer> listaDeStrings;

    //metodo fabrica
    @Override
    public List<Integer> getList() {
        if( listaDeStrings == null){
            listaDeStrings = new ArrayList<>();
        }
        return listaDeStrings;
    }
}
