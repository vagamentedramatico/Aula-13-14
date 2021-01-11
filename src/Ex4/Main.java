package Ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Lampada> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas lampadas são?");
        int numero = scanner.nextInt();
        for(int i = 1; i <= numero; i++) {
            System.out.println("Diga a potência da " + i + " lâmpada: ");
            int potencia = scanner.nextInt();
            Lampada lampada = new Lampada(potencia);
            list.add(lampada);
        }
        for(Lampada lampada: list) {
            System.out.println(lampada);
        }
        try {
            PrintWriter printWriter = new PrintWriter(new File("lampadas.txt"));
            for(Lampada lampada : list) {
                printWriter.println();
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
