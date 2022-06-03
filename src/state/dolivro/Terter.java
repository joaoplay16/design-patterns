package state.dolivro;

import java.util.*;

public class Terter {
    public static void main(String[] args) {
        No a = new No("A");        No b = new No("B");
        No c = new No("C");        No d = new No("D");
        No e = new No("E");        No f = new No("F");
        No g = new No("G");        No h = new No("H");

        a.addAdjacentes(b);

        List<No> l = new ArrayList<>();

        a.buscaProfundidade(l);

 /*       for(No n : l)
            System.out.println(n);*/
    }
}