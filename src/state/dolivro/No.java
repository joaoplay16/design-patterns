package state.dolivro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
*   Os pontos identificados que podem variar com o estado são: (a) a
    própria execução da busca em profundidade, pois no caso do nó ser preto ou cinza
    ela não deve ser executada; e (b) quando o nó assume uma cor.*/
public class No {
    private Set<No> adjacentes = new HashSet<>();
    //pode variar
    private Cor cor; // estado // hook class
    private String name;

    public No(String name){
        this.name = name;
        cor = new Branco();
    }
    //pode variar
    public void buscaProfundidade(List<No> list) {
        // se o No for Cinza ou Preto nao faz a busca
        cor.busca(this, list);
    }

    public Set<No> getAdjacentes() {
        return adjacentes;
    }

    public void addAdjacentes(No adj) {
        adjacentes.add(adj);
    }

    public void setCor(Cor cor, List<No> list)  {
        this.cor = cor;

        //Se for preto somente adiciona na lista
        //Se for Cinza executa buscaProfundidade() nos Nos proximos
        // e por fim seta a cor Preta
        cor.assumiu(this ,list);
    }
    public String toString() {
        return name  + " " + cor.getClass().getSimpleName();
    }
}