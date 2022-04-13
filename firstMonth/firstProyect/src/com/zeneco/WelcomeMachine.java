package com.zeneco;

public class WelcomeMachine {
    public static String welcomeUser() {
        var userInfo = ConsoleReader.getUserInfo();
        return "Bienvenido señor " + userInfo.name() + ", es un placer para nosotros contar con una persona de " + userInfo.age() + " años.\n" +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero " + userInfo.phone() + ".\n" +
                "\n" +
                "Feliz día";
    }
}
