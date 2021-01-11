package Ex3vP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
    private String nome;
    private int numeroConta;
    private List<Movimento> list;

    public ContaBancaria(String nome, int numeroConta) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        list = new ArrayList<>();
    }

    public ContaBancaria(String fileName) {
        list = new ArrayList<>();
        lerFicheiro(fileName);
    }

    public void addMovimento(String descricao, double valor) {
        list.add(new Movimento(descricao, valor));
    }

    public void lerFicheiro(String fileName) {
        list.clear();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            String firstLine = scanner.nextLine();
            String[] firstTokens = firstLine.split("_");
            this.nome = firstTokens[0];
            this.numeroConta = Integer.parseInt(firstTokens[1]);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(";");
                Movimento movimento = new Movimento(tokens[1], Double.parseDouble(tokens[2]));
                list.add(movimento);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        } catch (NumberFormatException e) {
            System.out.println("Erro ao ler o ficheiro");
        }
        for(Movimento movimento: list) {
            System.out.println(movimento);
        }
    }

    public void guardarFicheiro() {
        try {
            PrintWriter printWriter = new PrintWriter(new File("conta" + nome + ".txt"));
            printWriter.println(nome + "_" + numeroConta);
            int i = 1;
            for(Movimento movimento: list) {
                printWriter.println(i + ";" + movimento);
                i++;
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
