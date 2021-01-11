package Ex3vP;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("João", 42465);
        contaBancaria.addMovimento("Computador", 1000);
        contaBancaria.addMovimento("Maçã", 0.80);
        contaBancaria.addMovimento("Presente", 23);

        contaBancaria.guardarFicheiro();
        contaBancaria.lerFicheiro("contaJoão.txt");
        contaBancaria.addMovimento("Bacalhau", 30);
        contaBancaria.guardarFicheiro();

    }
}
