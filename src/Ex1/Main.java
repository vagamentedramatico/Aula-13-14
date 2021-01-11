package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("pessoas.txt"));
            while (scanner.hasNextLine()) {
                String pessoaString = scanner.nextLine();
                Pessoa pessoa = new Pessoa(pessoaString);
                pessoas.add(pessoa);
            }
        } catch (FileNotFoundException e) {
            System.out.println("O ficheiro não foi encontrado!");
            e.printStackTrace();
        }
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
