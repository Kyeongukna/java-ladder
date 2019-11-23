package view;

import java.util.List;

public class PrintUser {
    private static final int MAX_NAME_LANGTH = 5;
    public PrintUser(List<String> users) {
        printUsers(users);
    }

    private void printUsers(List<String> users) {
        for(int i = 0; i < users.size(); i++) {
            printUser(users.get(i));
        }
        System.out.println();
    }

    private void printUser(String user) {
        for(int i = 0; i <= MAX_NAME_LANGTH - user.length(); i++) {
            System.out.print(" ");
        }
        System.out.print(user);
    }

}
