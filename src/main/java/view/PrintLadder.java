package view;

import java.util.List;

public class PrintLadder {
    private final String LADDER_VERTICAL = "|";
    private final String LADDER_HORIZONTAL = "-----";
    private final String LADDER_HORIZONTAL_MARGIN = "     ";

    public PrintLadder(List<Boolean> ladderLine) {
        printLadderLine(ladderLine);
    }

    private void printLadderLine(List<Boolean> ladderLine) {
        for (boolean point : ladderLine ) {
            printLadderPoint(point);
            System.out.print(LADDER_VERTICAL);
        }
        System.out.println();
    }

    private void printLadderPoint(boolean point) {
        if(point) {
            System.out.print(LADDER_HORIZONTAL);
            return;
        }
        System.out.print(LADDER_HORIZONTAL_MARGIN);
    }
}
