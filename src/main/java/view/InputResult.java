package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputResult {
    private List<String> results;

    public InputResult(int userLength) {
        results = new ArrayList<String>();
        printResultInput();
        InputResults(userLength);
    }

    public void printResultInput() {
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
    }

    public void InputResults(int userLength) {
        Scanner scanner = new Scanner(System.in);
        String results = scanner.nextLine();
       try {
           String[] result = results.split(",");
           for(int i = 0 ; i < userLength ; i++ ) {
               this.results.add((result[i]));
            }
        }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("결과의 수가 유저의 수와 다릅니다.");
           System.exit(0);
       }
    }

    public List<String> getResults() {
        return results;
    }

}
