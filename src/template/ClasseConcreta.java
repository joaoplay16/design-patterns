package template;

public class ClasseConcreta extends ClasseAbstrata {


    /*
    Hook Methods são uma técnica para permitir a extensão de com-
    portamento e o Template Method.
    Seria correto dizer que o Template
    Method utiliza Hook Methods em sua solução
    * */
    @Override
    String passoAlgoritimoA() { // implementação dos hook methods
        return "ClasseConcreta: passoAlgoritimoA";
    }

    @Override
    String passoAlgoritimoB() { // implementação dos hook methods
        return "ClasseConcreta: passoAlgoritimoB";
    }
}
