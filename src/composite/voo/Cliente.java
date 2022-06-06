package composite.voo;

public class Cliente {
    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("São Paulo", "Brasília", 500);
        TrechoSimples ts2 = new TrechoSimples("Brasília", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife","Natal", 350);
        TrechoComposto tc1 = new TrechoComposto(ts2, ts3, 30);
        TrechoComposto tc2 = new TrechoComposto(ts1, tc1, 50);

        System.out.println(ts1.getOrigem());
        System.out.println(tc1.getOrigem());

    }
}
