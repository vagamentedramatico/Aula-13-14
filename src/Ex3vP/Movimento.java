package Ex3vP;

public class Movimento {
    private String descricao;
    private double valor;

    public Movimento(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + ";" + valor;
    }
}
