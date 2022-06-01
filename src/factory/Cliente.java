package factory;

public class Cliente {
    public static void main (String[] args){
        ClasseConcreta classeConcreta = new ClasseConcreta();
        classeConcreta.addToList("um");
        classeConcreta.addToList("dois");
        classeConcreta.addToList("três");
        classeConcreta.metodoGeral();

        ClasseConcretaInteger classeConcretaInteger = new ClasseConcretaInteger();
        classeConcretaInteger.addToList(1);
        classeConcretaInteger.addToList(2);
        classeConcretaInteger.addToList(3);
        classeConcretaInteger.metodoGeral();
    }
}
