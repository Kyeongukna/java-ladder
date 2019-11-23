package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUser {
    private List<String> userNames;
    private static final int MAX_NAME_LENGTH = 5;

    public InputUser() {
        userNames = new ArrayList<String>();
        printUserInput();
        InputUserName();
    }

    class nameLengthException extends Exception {
        public nameLengthException() {
            System.out.println("이름은 5글자 이하로 입력해야합니다.");
            System.exit(0);
        }
    }

    private void printUserInput() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }

    private void InputUserName() {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        String[] userNames = names.split(",");
        for(int i = 0 ; i < userNames.length ; i++ ) {
            this.userNames.add((checkName(userNames[i])));
        }
    }
    private String checkName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            new nameLengthException();
        }
        return name;
    }

    public List<String> getUserNames() {
        return userNames;
    }

}
