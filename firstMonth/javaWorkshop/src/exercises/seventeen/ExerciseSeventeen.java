package exercises.seventeen;

import exercises.seventeen.subclasses.Lavadora;
import exercises.seventeen.subclasses.Television;

import java.util.ArrayList;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = fillListWithElectrodomesticos(10);
        filterByClass(electrodomesticos);


    }


    public static void  filterByClass(Electrodomestico[] electrodomesticos) {
        int electrodomesticosTotal = 0;
        int tvTotal = 0;
        int lavadoraTotal = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();
            electrodomesticosTotal += electrodomestico.getPrecioBase();
            if (electrodomestico instanceof Lavadora) {
                lavadoraTotal += electrodomestico.getPrecioBase();
            } else if (electrodomestico instanceof  Television) {
                tvTotal += electrodomestico.getPrecioBase();
            }
        }

        System.out.println("electrodomesticosTotal " + electrodomesticosTotal);
        System.out.println("tvTotal: " + tvTotal);
        System.out.println("lavadoraTotal: " + lavadoraTotal);
    }

    public static Electrodomestico[] fillListWithElectrodomesticos(int length) {
        Electrodomestico[] array = new Electrodomestico[length];
        for (int i = 0; i < length; i++) {
            int r = randomInt(3);
            if (r == 1) {
                array[i] = new Electrodomestico();
            } else if (r == 2) {
                array[i] = new Lavadora(25);
            } else {
                array[i] = new Television(45.0, true);
            }
        }
        return array;
    }

    public static int randomInt(int n) {
        return (int) (Math.random() * (n + 1));
    }
}
