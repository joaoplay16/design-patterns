package state.meu;

import state.dolivro.No;

import java.util.List;

//Classe que abstrai o estado de um nó
public abstract class Cor {
    void mudar(Caneta caneta) { }
}
//Implementações dos três estados possíveis
 class Branco extends Cor {
    void mudar(Caneta caneta){
       caneta.setCor(new Cinza());
    }
}
 class Cinza extends Cor {
     void mudar(Caneta caneta){
         caneta.setCor(new Preto());
     }
}
 class Preto extends Cor {
     void mudar(Caneta caneta){
         caneta.setCor(new Branco());
     }
}

