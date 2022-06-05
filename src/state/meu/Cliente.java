package state.meu;


import java.util.Scanner;

public class Cliente {
    public static void main (String[] args){
        Caneta caneta = new Caneta("Faber Castel"); //branco
        System.out.println(caneta);

        //o estado muda internamente
        caneta.mudarCor(); // cinza
        System.out.println(caneta);

        caneta.mudarCor(); // preto
        System.out.println(caneta);


        //se eu passasse a cor pro parametro, eu teria que saber a cor
        // do objeto pra poder mudar, iria precisar de condicões IF's



        Client.Companion.main();
    }
}
