package exercises.seventeen;

import java.util.HashMap;

public class Electrodomestico {
    protected int precioBase = 100;
    protected ColorEnum color = ColorEnum.BLANCO;
    protected ConsumoEnergeticoEnum consumoEnergetico = ConsumoEnergeticoEnum.F;
    protected int peso = 5;

    protected Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, ColorEnum color, ConsumoEnergeticoEnum consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico() {
//        it's not necessary since we are using enums
    }
    private void comprobarColor() {
//        it's not necessary since we are using enums
    }

    public void precioFinal() {
        int incrementByConsumoEnergetico = incrementByConsumoEnergetico(this.consumoEnergetico);
        int incrementByPeso = incrementByPeso(this.peso);
        this.precioBase += incrementByConsumoEnergetico + incrementByPeso;
    }

    protected int incrementByPeso(int peso) {
        int result = 0;
        if( peso >= 0 && (peso <= 19)) {
            result += 10;
        } else if (peso >= 20 && (peso <= 49)) {
            result += 50;
        } else if (peso >= 50 && (peso <= 79)) {
            result += 80;
        } else if (peso > 80 ) {
            result += 100;
        }

        return result;
    }
    protected int incrementByConsumoEnergetico(ConsumoEnergeticoEnum consumoEnergetico) {
        HashMap<ConsumoEnergeticoEnum, Integer> map = new HashMap<>();
        map.put(ConsumoEnergeticoEnum.A, 100);
        map.put(ConsumoEnergeticoEnum.B, 80);
        map.put(ConsumoEnergeticoEnum.C, 60);
        map.put(ConsumoEnergeticoEnum.D, 50);
        map.put(ConsumoEnergeticoEnum.E, 30);
        map.put(ConsumoEnergeticoEnum.F, 10);
        return map.get(consumoEnergetico);
    }

//    getters

    public int getPrecioBase() {
        return precioBase;
    }

    public ColorEnum getColor() {
        return color;
    }

    public ConsumoEnergeticoEnum getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}
