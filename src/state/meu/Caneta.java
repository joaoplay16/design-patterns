package state.meu;

public class Caneta {
    private String nome;
    private Cor cor;

    public Caneta(String nome){
        this.nome = nome;
        this.cor = new Branco();
    }

    public void mudarCor(){
        cor.mudar(this);
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return this.nome + " - " + cor.getClass().getSimpleName();
    }
}

