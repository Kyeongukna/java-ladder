package controller;

import model.Ladder;
import model.LadderResults;
import model.Line;
import model.Users;
import view.*;

public class LadderManager {
    private Ladder ladder;
    private Users users;
    private PrintResult printResult;

    public LadderManager() {
        initLadder();
        startLadder();
    }

    private void initLadder() {
        InputUser inputUser = new InputUser();
        users = new Users (inputUser.getUserNames());
        InputResult inputResult = new InputResult(users.getNameLength());
        printResult = new PrintResult(inputResult.getResults());
        InputLadderHeight inputLadderHeight = new InputLadderHeight();
        ladder = new Ladder(users.getNameLength(), inputLadderHeight.getHeight());
    }

    private void startLadder() {
        new PrintUser(users.getNames());
        for(Line line: ladder.getLadders()) {
            new PrintLadder(line.getPoint());
        }
        printResult.printLadderResults();
        LadderResults ladderResults = new LadderResults(ladder);
        printResult.selectUser(users.getNames(), ladderResults.getLadderResult());
    }

}
