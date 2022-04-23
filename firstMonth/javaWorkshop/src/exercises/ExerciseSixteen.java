package exercises;

import classes.person.PersonSixteen;

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type name:");
        String name = scanner.nextLine();
        System.out.println("type age:");
        String age = scanner.nextLine();
        System.out.println("type gender:");
        String gender = scanner.nextLine();
        System.out.println("type weight:");
        String weight = scanner.nextLine();
        System.out.println("type height:");
        String height = scanner.nextLine();
        PersonSixteen person1 = new PersonSixteen(name, Integer.parseInt(age), gender.charAt(0), Double.parseDouble(weight), Double.parseDouble(height));
        PersonSixteen person2 = new PersonSixteen(name, Integer.parseInt(age), gender.charAt(0));
        PersonSixteen person3 = new PersonSixteen();
        person3.setName("david");
        person3.setAge(23);
        person3.setGender('M');
        person3.setHeight(1.78);
        person3.setWeight(68.3);
        checkWeight(person1);
        checkWeight(person2);
        checkWeight(person3);
        checkAge(person1);
        checkAge(person2);
        checkAge(person3);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }

    public static void checkWeight(PersonSixteen person) {
        System.out.println(person.calculateBMI());
    }

    public static void checkAge(PersonSixteen person) {
        boolean isAdult = person.isAdult();
        if (isAdult) {
            System.out.println(person.getName() + " is an adult");
        } else  {
            System.out.println(person.getName() + " is not an adult");
        }
    }


}
