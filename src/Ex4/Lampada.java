package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Lampada {

    private int potencia;

    public Lampada(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "potencia=" + potencia +
                '}';
    }
}
