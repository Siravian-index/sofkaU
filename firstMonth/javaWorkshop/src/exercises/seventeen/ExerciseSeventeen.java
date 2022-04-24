package exercises.seventeen;

import exercises.seventeen.subclasses.Lavadora;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        Electrodomestico e = new Electrodomestico();
        System.out.println(e.precioBase);
        e.precioFinal();
        System.out.println(e.precioBase);
        Lavadora l = new Lavadora();
        System.out.println(l.precioBase);
        l.precioFinal();
        System.out.println(l.precioBase);

    }
}
