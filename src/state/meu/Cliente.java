package state.meu;


public class Cliente {
    public static void main (String[] args){
        Caneta caneta = new Caneta("Faber Castel"); //branco
        //o estado muda internamente
        caneta.mudarCor(); // cinza
        caneta.mudarCor(); // preto

        //se eu passasse a cor pro parametro, eu teria que saber a cor
        // do objeto pra poder mudar, iria precisar de condicões IF's

        System.out.println(caneta);
    }
}
