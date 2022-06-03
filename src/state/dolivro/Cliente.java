package state.dolivro;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        No a = new No("A");        No b = new No("B");
        No c = new No("C");        No d = new No("D");
        No e = new No("E");        No f = new No("F");
        No g = new No("G");        No h = new No("H");

        a.addAdjacentes(b);        c.addAdjacentes(d);
        a.addAdjacentes(e);        f.addAdjacentes(c);
        f.addAdjacentes(h);        b.addAdjacentes(c);
        d.addAdjacentes(b);        e.addAdjacentes(f);
        f.addAdjacentes(g);        a.addAdjacentes(h);

        List<No> l = new ArrayList<>();

        a.buscaProfundidade(l);

 /*       for(No n : l)
            System.out.println(n);*/
    }
}