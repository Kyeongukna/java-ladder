package view;

import java.util.List;

public class PrintLadder {
    private static final String LADDER_VERTICAL = "|";
    private static final String LADDER_HORIZONTAL = "-----";
    private static final String LADDER_HORIZONTAL_MARGIN = "     ";

    public PrintLadder(List<Boolean> ladderLine) {
        printLadderLine(ladderLine);
    }

    private void printLadderLine(List<Boolean> ladderLine) {
        for (int i = 0; i < ladderLine.size() - 1 ; i ++ ) {
            printLadderPoint(ladderLine.get(i));
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
