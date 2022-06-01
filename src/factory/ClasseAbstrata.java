package factory;

import template.ClasseConcreta;

import java.util.List;

/* Padrão factory
    A partir desse padrão, é possível desacoplar a superclasse da criação de uma de-
    pendência. Com a criação das instâncias na subclasse, apenas elas ficam acopladas as
    classes concretas da hierarquia. Dessa forma, caso uma nova instância da dependên-
    cia precise ser utilizada pela superclasse, basta criar uma nova subclasse que retorne
    aquela instância.
* */

/*
    Como a classe
    ClasseAbstrata especificou de forma explícita o tipo genérico <E> de sua superclasse,
    todos os elementos da classe que usavam o parâmetro do tipo genérico serão fixados.
*/
public abstract class ClasseAbstrata<E> {
//    final para nao ser sobrescrito
    public final void metodoGeral(){
        System.out.println("Instância: " + getClass().getSimpleName());

        //consigo usar a lista que foi instanciada na subclasse que implementa ClasseAbstrata
        for (E item: getList()) {//getList() método gancho
            System.out.println("ITEM: " + item);
        }

        System.out.println("\n");
    }

    /*O padrão Factory Method utiliza um hook method para delegar a criação da instância para
      a subclasse. Isso permite que métodos mais gerais na superclasse possam utilizar essa instância
      mesmo sem conhecer a classe concreta.
    */
    public abstract List<E> getList(); //metodo fabrica e támbem hook method

    //consigo usar a lista que foi instanciada na subclasse que implementa ClasseAbstrata
    public void addToList(E obj){
        List<E> lista = getList();
        lista.add(obj);
    }
}
