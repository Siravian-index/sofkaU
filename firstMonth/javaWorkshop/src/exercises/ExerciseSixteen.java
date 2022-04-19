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

    }


}
