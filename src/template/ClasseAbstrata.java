package template;

public abstract class ClasseAbstrata {
//    final para nao ser sobrescrito
    public final void metodoTemplate(){
        System.out.println(passoAlgoritimoA());

        System.out.println("Fazendo algo no metodo template da ClasseAbstrata.");

        System.out.println(passoAlgoritimoB());

    }

    abstract String passoAlgoritimoA(); //hook method
    abstract String passoAlgoritimoB(); //hook method
}
