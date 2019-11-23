package view;

import java.util.List;
import java.util.Scanner;

public class PrintResult {
    private static final int MAX_RESULT_LANGTH = 5;
    private List<String> results;

    public PrintResult(List<String> results) {
        this.results = results;
    }

    private void printLadderResult(String result) {
        for(int i = 0; i <=  (MAX_RESULT_LANGTH - result.length()) ; i++) {
            System.out.print(" ");
        }
        System.out.print(result);
    }

    public void printLadderResults() {
        for(int i = 0; i < results.size(); i++) {
            printLadderResult(results.get(i));
        }
        System.out.println();
    }

    public void selectUser(List<String> users, List<Integer> ladderResults) {
        System.out.println("결과를 보고 싶은 사람은?");
        Scanner scanner = new Scanner(System.in);
        String selectUser = scanner.next();
        if(selectUser.equals("all")) {
            printAllUser(users, ladderResults);
            return;
        }
        printSelectUser(ladderResults, users.indexOf(selectUser));
    }

    private void printSelectUser(List<Integer> ladderResults, int selectIndex) {
        System.out.println("실행결과");
        System.out.println(results.get(ladderResults.get(selectIndex)));
    }

    private void printAllUser(List<String> users, List<Integer> ladderResults) {
        System.out.println("실행결과");
        for(int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i) + " : " + results.get(ladderResults.get(i)));
        }
    }

}
