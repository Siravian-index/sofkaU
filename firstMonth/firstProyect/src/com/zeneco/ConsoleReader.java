package com.zeneco;

import com.zeneco.user.UserRecordTest;

import java.util.Scanner;

public class ConsoleReader {

    private ConsoleReader(){

    }
    public static UserRecordTest getUserInfo() {
        var scanner = new Scanner(System.in);
        System.out.println("Nombre de usuario");
        String userName = scanner.nextLine();
        System.out.println("Celular");
        String userPhone = scanner.nextLine();
        System.out.println("Edad");
        String userAge = scanner.nextLine();
        return new UserRecordTest(userName, userPhone, userAge);
    }
}
