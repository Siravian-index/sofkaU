package exercises.seventeen.subclasses;

import exercises.seventeen.ColorEnum;
import exercises.seventeen.ConsumoEnergeticoEnum;
import exercises.seventeen.Electrodomestico;

public class Lavadora extends Electrodomestico {
    protected int carga = 5;


    public  Lavadora() {
        super();
    }

    public Lavadora( int carga) {
        super();
        this.carga = carga;
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        int incrementByLoad = incrementByCarga();
        this.precioBase += incrementByLoad;
    }

    private int incrementByCarga() {
        final int THIRTY_KG = 30;
        final int priceIncrement = 50;
        if(this.carga > THIRTY_KG) {
            return priceIncrement;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
