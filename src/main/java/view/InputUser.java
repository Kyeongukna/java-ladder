package view;

import java.util.Scanner;

public class InputUser {
    private String userNames;

    public InputUser() {
        printUserInput();
        this.userNames = InputUserName();
    }

    private void printUserInput() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    private String InputUserName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getUserNames() {
        return userNames;
    }
}
