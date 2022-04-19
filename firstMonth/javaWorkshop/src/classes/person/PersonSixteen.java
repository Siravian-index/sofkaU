package classes.person;

import classes.person.enums.Gender;
import classes.person.interfaces.IPerson;

public class PersonSixteen implements IPerson {
    private String name;
    private int age;
    private final int DNI;
    private Gender gender;
    private double weight;
    private double height;


    public PersonSixteen(String name, int age, char genre) {
        this.name = name;
        this.age = age;
        setGender(genre);
        this.DNI = generateDNI();
    }

    public PersonSixteen(String name, int age, char genre, double weight, double height) {
        this.name = name;
        this.age = age;
        this.DNI = generateDNI();
        setGender(genre);
        this.weight = weight;
        this.height = height;
    }

    public PersonSixteen() {
        this.DNI = generateDNI();
    }


    @Override
    public int calculateBMI() {
        final double BMI = this.getWeight() / (Math.pow(this.getHeight(), 2));
        System.out.println("BMI is: " + BMI);
        final boolean isUnderWeight = BMI < 20;
        final boolean isHealthyWeight = BMI >= 20 && BMI <= 25;
        final boolean isOverWeight = BMI > 25;
        if (isUnderWeight) {
            return -1;
        } else if (isHealthyWeight) {
            return 0;
        } else if (isOverWeight) {
            return 1;
        } else {
            throw new IllegalStateException("Value does not fit into the design");
        }

    }

    @Override
    public boolean isAdult() {
        final int ADULT_AGE = 18;
        return this.age > ADULT_AGE;
    }


    @Override
    public int generateDNI() {
        final int BASE = 100_000_000;
        return (int) (Math.random() * BASE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDNI() {
        return DNI;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        if (gender == 'f' || gender == 'F') {
            this.gender = Gender.F;
        } else {
            this.gender = Gender.M;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonSixteen{" + "name='" + name + '\'' + ", age=" + age + ", DNI=" + DNI + ", gender=" + gender + ", weight=" + weight + ", height=" + height + '}';
    }
}
