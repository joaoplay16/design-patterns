package composite.voo;

/*Observe pelo exemplo, que TrechoComposto pode ser composto tanto por ins-
  tâncias de TrechoSimples quanto por instâncias do próprio TrechoComposto
  de forma transparente, criando uma estrutura de árvore.

  O padrão Composite possui o objetivo de permitir que a mesma abstração
  possa ser utilizada para uma instância simples e para seu conjunto.


*/
public class TrechoComposto implements TrechoAereo {
    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaconexao;

    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo,
                          double taxaconexao) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaconexao = taxaconexao;

//        System.out.println(primeiro.getDestino() + " - " + segundo.getOrigem());

        if (primeiro.getDestino() != segundo.getOrigem())
            throw new RuntimeException("O destino do primeiro" +
                    " não é igual a origem do segundo (" + primeiro.getDestino() + " - " + segundo.getOrigem() + ")");
    }

    /*   O segredo do padrão Composite está na implementação dos métodos
    compostos, que devem invocar os métodos das instâncias que o compõe e executar
    uma lógica para criar um resultado único*/
    public String getOrigem() {

        return primeiro.getOrigem(); //invocando metodo da instancia que compoe
    }

    public String getDestino() {
        return segundo.getDestino(); //invocando metodo da instancia que compoe
    }

    public double getPreco() {
        return primeiro.getPreco() + segundo.getPreco() +
                taxaconexao;
    }
}