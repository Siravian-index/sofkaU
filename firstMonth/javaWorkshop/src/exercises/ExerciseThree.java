package exercises;


/*
* Haz una aplicación que calcule el área de un círculo(pi*R2).
* El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
* Usa la constante PI y el método pow de Math.*/
public class ExerciseThree {
    public static void main(String[] args) {
        try{
            double radius = ExerciseOne.getNumber();
            System.out.println("Area is: " + calculateCircleArea(radius));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculateCircleArea(double radius) {
        double diameter = radius * 2;
        double  PI = Math.PI;
        return PI * Math.pow(diameter/2, 2);
    }
}
