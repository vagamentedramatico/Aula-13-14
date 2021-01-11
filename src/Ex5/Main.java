package Ex5;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mapa> mapa = new ArrayList<>();
        Scanner scanner = new Scanner(new File("mapa.txt"));
        while (scanner.hasNextLine()) {
            char mapaChar = scanner.nextLine();
            Mapa mapa = new Mapa(mapaChar);

        }
    }
}
