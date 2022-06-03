package state.dolivro;

import java.util.List;

//Classe que abstrai o estado de um nó
public abstract class Cor {
    void busca(No no, List<No> list) {}
    void assumiu(No no, List<No> list)  {}
}
//Implementações dos três estados possíveis
 class Branco extends Cor {
    public void busca(No no, List<No> list)  {
        no.setCor(new Cinza(), list);
    }
}
 class Cinza extends Cor {
    void assumiu(No no, List<No> list) {
        for(No adj : no.getAdjacentes()){
            adj.buscaProfundidade(list);
            System.out.println(adj);

        no.setCor(new Preto(), list);
    }
    }
}
 class Preto extends Cor {
    void assumiu(No no, List<No> list) {
        list.add(no);
    }
}

