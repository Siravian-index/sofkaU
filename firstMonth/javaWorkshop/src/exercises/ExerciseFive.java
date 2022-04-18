package exercises;

/*
* Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
* Realiza el ejercicio anterior usando un ciclo for.
 * */
public class ExerciseFive {
    public static void main(String[] args) {
        System.out.println("using while");
        loopingWhile(100);
        System.out.println("using for");
        loopingFor(100);
    }
    public static void loopingWhile(int x) {
        int c = 1;
        while (c <= x) {
            System.out.println(c);
            c++;
        }
    }
    public static void loopingFor(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

}
