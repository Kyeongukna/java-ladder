package view;

import java.util.Scanner;

public class InputLadderHeight {
    private int height;

    public InputLadderHeight() {
        printLadderInput();
        this.height = InputHeight();
    }

    private void printLadderInput() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
    }

    private int InputHeight() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getHeight() {
        return height;
    }
}
