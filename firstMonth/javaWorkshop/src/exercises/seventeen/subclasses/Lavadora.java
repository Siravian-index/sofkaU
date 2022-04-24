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

    public void precioFinal() {
//        int incrementByConsumoEnergetico = incrementByConsumoEnergetico(this.consumoEnergetico);
//        int incrementByPeso = incrementByPeso(this.peso);
//        this.precioBase += incrementByConsumoEnergetico + incrementByPeso;
//        precioFinal();
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
