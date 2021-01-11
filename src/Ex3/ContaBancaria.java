package Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String descricao;
        double valor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        descricao = scanner.nextLine();
        System.out.println("");
        valor = scanner.nextDouble();

        try {
            File file = new File("contabancaria.txt");
            ArrayList<String> linhasFicheiro = new ArrayList<>();
            linhasFicheiro.add(";" + descricao + ";" + valor);

            if (file.exists()) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    linhasFicheiro.add(fileScanner.nextLine());
                }
            }

            PrintWriter printWriter = new PrintWriter(file);
            for (String linha : linhasFicheiro) {
                printWriter.println(linha);
            }

            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void id(int linhasFicheiro) {
        int nl = 0;
        for(int i = 0; i <= linhasFicheiro; i++) {
            nl = nl + i;
        }
        System.out.println(nl);
    }
}
