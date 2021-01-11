package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira a sua idade: ");
        Integer idade = null;
        while(idade == null) {
            try {
                idade = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Idade inválida. Tente novamente: ");
                scanner.nextLine();
            }
        }
        System.out.println("O utilizador inseriu: " + nome + " e " + idade);

        try {
            File file = new File("pessoas2.txt");
            ArrayList<String> linhasFicheiro = new ArrayList<>();
            linhasFicheiro.add(nome + ":" + idade);

            if(file.exists()) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    linhasFicheiro.add(fileScanner.nextLine());
                }
            }

            PrintWriter printWriter = new PrintWriter(file);
            for(String linha : linhasFicheiro) {
                printWriter.println(linha);
            }
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
