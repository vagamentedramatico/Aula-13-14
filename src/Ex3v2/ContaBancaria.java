package Ex3v2;

public class ContaBancaria {
    private String descricao;
    private double valor;

    public ContaBancaria (String cbString) {
        String[] separado = cbString.split(";");
        try {
            this.descricao = separado[0];
            try {
                this.valor = Integer.parseInt(separado[1]);
            } catch (NumberFormatException e) {
                System.out.println("Não foi possível ler o valor.");
            }
            } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não foi possível ler esta pessoa.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
